package Core;

import javax.swing.JTextArea;

/**
 *
 * @author zahid
 */
public class BinarySearchTree<T extends Comparable<T>> {

    BSTNode<T> root;

    public void add(T newData) {
        root = addRecursive(root, newData);
    }

    private BSTNode<T> addRecursive(BSTNode<T> current, T newData) {
        if (current == null) {
            return new BSTNode<>(newData);
        }
        int comparison = newData.compareTo(current.data);

        if (comparison < 0) {
            current.left = addRecursive(current.left, newData);            
        } else if (comparison > 0) {
            current.right = addRecursive(current.right, newData);
        } else {
            
        }
        return current;
    }

    public boolean search(T word) {
        return searchRecursive(root, word);
    }

    private boolean searchRecursive(BSTNode<T> current, T word) {
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

    public void inOrder(BSTNode<T> node, JTextArea jTextArea) {
        if (node != null) {
            inOrder(node.left, jTextArea);
            jTextArea.append(node.data.toString() + "\n");
            inOrder(node.right, jTextArea);
        }
    }

    public void postOrder(BSTNode<T> node, JTextArea jTextArea) {
        if (node != null) {
            postOrder(node.left, jTextArea);
            postOrder(node.right, jTextArea);
            jTextArea.append(node.data.toString() + "\n");
        }
    }

    public void preOrder(BSTNode<T> node, JTextArea jTextArea) {
        if (node != null) {
            jTextArea.append(node.data.toString() + "\n");
            preOrder(node.left, jTextArea);
            preOrder(node.right, jTextArea);
        }
    }
}
