package Core;

import javax.swing.JTextArea;

/**
 *
 * @author zahid
 */
public class BinarySearchTree {

    BSTNode<BSTData> root;

    public void add(BSTData newData) {
        root = addRecursive(root, newData);
    }

    private BSTNode<BSTData> addRecursive(BSTNode<BSTData> current, BSTData newData) {
        if (current == null) {
            return new BSTNode<>(newData);
        }
        int comparison = newData.compareTo(current.data);

        if (comparison < 0) {
            current.left = addRecursive(current.left, newData);
        } else if (comparison > 0) {
            current.right = addRecursive(current.right, newData);
        } else {
            current.data.update();
        }
        return current;
    }

    public void search(String word, JTextArea jTextArea) {
        BSTData searchData = new BSTData(word, "");
        searchRecursive(root, searchData, jTextArea);
    }

    private void searchRecursive(BSTNode<BSTData> current, BSTData searchData, JTextArea jTextArea) {
        if (current == null) {
            jTextArea.append("Word not found");
            return;
        }

        int comparison = searchData.getWord().compareTo(current.data.getWord());

        if (comparison == 0) {
            MyLinkedList<WordFrequency> wordCounts = current.data.getWordCounts();
            for (WordFrequency freq : wordCounts) {
                jTextArea.append("File: " + freq.getDocumentName() + ", Frequency: " + freq.getFrequency() + "\n");
            }
        } else if (comparison < 0) {
            searchRecursive(current.left, searchData, jTextArea);
        } else {
            searchRecursive(current.right, searchData, jTextArea);
        }

    }

    public String getSuggestion(String prefix) {
        return getSuggestionRec(root, prefix, "");
    }

    private String getSuggestionRec(BSTNode<BSTData> root, String prefix, String suggestion) {
        if (root == null) {
            return suggestion.isEmpty() ? null : suggestion;
        }

        if (root.data.getWord().startsWith(prefix)) {
            if (root.data.getWord().equals(prefix)) {
                return null;
            }
            return root.data.getWord();
        }

        if (prefix.compareTo(root.data.getWord()) < 0) {
            return getSuggestionRec(root.left, prefix, suggestion);
        }

        return getSuggestionRec(root.right, prefix, root.data.getWord());
    }

    public void inOrder(BSTNode<BSTData> node, JTextArea jTextArea) {
        if (node != null) {
            inOrder(node.left, jTextArea);
            jTextArea.append(node.data.toString() + "\n");
            inOrder(node.right, jTextArea);
        }
    }

    public void postOrder(BSTNode<BSTData> node, JTextArea jTextArea) {
        if (node != null) {
            postOrder(node.left, jTextArea);
            postOrder(node.right, jTextArea);
            jTextArea.append(node.data.toString() + "\n");
        }
    }

    public void preOrder(BSTNode<BSTData> node, JTextArea jTextArea) {
        if (node != null) {
            jTextArea.append(node.data.toString() + "\n");
            preOrder(node.left, jTextArea);
            preOrder(node.right, jTextArea);
        }
    }
}
