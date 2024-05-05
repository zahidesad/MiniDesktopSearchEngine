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

    private String content;
    private MyLinkedList<String> ignoredWords = new MyLinkedList<>();

    public void cleanDocument(File file) {
        readHTMLFileWithoutTags(file);
        cleanUpIgnoredWords();
        cleanUpSpaces();
    }

    public MyLinkedList<String> readIgnoredWords(File filePath) {
        try ( BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                getIgnoredWords().addLast(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return getIgnoredWords();
    }

    private void readHTMLFileWithoutTags(File file) {
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
        content = contentBuilder.toString();
    }

    private void cleanUpIgnoredWords() {
        for (String ignoredWord : getIgnoredWords()) {
            content = content.replaceAll("\\b" + ignoredWord + "\\b", "");
        }
    }

    private void cleanUpSpaces() {
        content = content.replaceAll("\\s+", " ").trim();
    }

    public void addFileToBST(BinarySearchTree bst, File file) {
        String[] words = content.split(" ");
        for (String word : words) {
            BSTData bstData = new BSTData(word, file.getName());
            bst.add(bstData);
        }
    }

    public String getContent() {
        return content;
    }

    public MyLinkedList<String> getIgnoredWords() {
        return ignoredWords;
    }
}
