package Core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author zahid
 */
public class Document {

    private String name;
    private String content;
    private MyLinkedList contentWordsList;

    public Document(File filePath, MyLinkedList ignoredWords) {
        setDocumentFields(filePath, ignoredWords);
    }

    protected void setDocumentFields(File filePath, MyLinkedList ignoredWords) {
        if (filePath != null && ignoredWords != null) {
            content = readHTMLFileWithoutTags(filePath);
            content = cleanUpIgnoredWords(getContent(), ignoredWords);
            content = cleanUpSpaces(getContent());
            name = filePath.getName();

            contentWordsList = new MyLinkedList();
            StringBuilder word = new StringBuilder();
            for (int i = 0; i < content.length(); i++) {
                char c = content.charAt(i);
                if (c == ' ') {
                    getContentWordsList().addLast(word.toString());
                    word = new StringBuilder();
                } else {
                    word.append(c);
                }
            }
            getContentWordsList().addLast(word.toString()); // Add last word of content
        } else {
            JOptionPane.showMessageDialog(null, "Please select the file containing ignored words first.",
                    "Ignored Words Weren't Select", JOptionPane.WARNING_MESSAGE);
        }
    }

    protected String readHTMLFileWithoutTags(File filePath) {
        StringBuilder contentBuilder = new StringBuilder();
        try ( BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean insideTag = false;
            while ((line = br.readLine()) != null) {
                if (line.contains("<") && line.contains(">")) {
                    insideTag = true;
                }
                if (!insideTag) {
                    // Noktalama işaretleri ve boşlukları temizle
                    line = line.replaceAll("[\\p{Punct}\\s]+", " ").trim();
                    // Kelimeleri ekle
                    String[] words = line.split(" ");
                    for (String word : words) {
                        contentBuilder.append(word).append(" ");
                    }
                }
                if (line.contains(">")) {
                    insideTag = false;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return contentBuilder.toString();
    }

    protected String cleanUpIgnoredWords(String content, MyLinkedList ignoredWords) {
        MyLinkedListNode<String> current = ignoredWords.head;
        while (current != null) {
            String wordToRemove = current.data;
            content = content.replaceAll("\\b" + wordToRemove + "\\b", "");
            current = current.next;
        }
        return content;
    }

    protected String cleanUpSpaces(String content) {
        return content.replaceAll("\\s+", " ").trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MyLinkedList getContentWordsList() {
        return contentWordsList;
    }

}
