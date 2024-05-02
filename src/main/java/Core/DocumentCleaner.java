package Core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author zahid
 */
public class DocumentCleaner {

    private File file;
    private String fileName;
    private String content;
    private MyLinkedList contentWordsList;

    public DocumentCleaner(File file, MyLinkedList ignoredWords) {
        this.file = file;
        setDocumentFields(ignoredWords);
    }

    protected void setDocumentFields(MyLinkedList ignoredWords) {
        content = readHTMLFileWithoutTags();
        content = cleanUpIgnoredWords(ignoredWords);
        content = cleanUpSpaces();
        fileName = file.getName();

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
        contentWordsList.addLast(word.toString()); // Add last word of content
    }

    protected String readHTMLFileWithoutTags() {
        StringBuilder contentBuilder = new StringBuilder();
        try ( BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            boolean insideTag = false;
            while ((line = br.readLine()) != null) {
                if (line.contains("<") && line.contains(">")) {
                    insideTag = true;
                }
                if (!insideTag) {
                    line = line.replaceAll("[\\p{Punct}\\s]+", " ").trim();
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

    protected String cleanUpIgnoredWords(MyLinkedList ignoredWords) {
        MyLinkedListNode<String> current = ignoredWords.head;
        while (current != null) {
            String wordToRemove = current.data;
            content = content.replaceAll("\\b" + wordToRemove + "\\b", "");
            current = current.next;
        }
        return content;
    }

    protected String cleanUpSpaces() {
        return content.replaceAll("\\s+", " ").trim();
    }

    public String getName() {
        return fileName;
    }

    public void setName(String name) {
        this.fileName = name;
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
