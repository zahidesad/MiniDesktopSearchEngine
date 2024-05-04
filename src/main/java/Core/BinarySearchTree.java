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

    public boolean search(BSTData word) {
        return searchRecursive(root, word);
    }

    private boolean searchRecursive(BSTNode<BSTData> current, BSTData word) {
        if (current == null) {
            return false;
        }

        int comparison = word.compareTo(current.data);

        if (comparison == 0) {
            return true;
        } else if (comparison < 0) {
            return searchRecursive(current.left, word);
        } else {
            return searchRecursive(current.right, word);
        }
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
