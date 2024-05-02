package Core;

/**
 *
 * @author zahid
 */
public class BinarySearchTree<T> {

    BSTNode<BSTData> root;

    public void add(BSTData newData) {
        root = addRecursive(root, newData);
    }

    private BSTNode<BSTData> addRecursive(BSTNode<BSTData> current, BSTData newData) {
        if (current == null) {
            return new BSTNode<>(newData);
        }
        int comparison = newData.getWord().compareTo(current.data.getWord());

        if (comparison < 0) {
            current.left = addRecursive(current.left, newData);
        } else if (comparison > 0) {
            current.right = addRecursive(current.right, newData);
        } else {

        }
        return current;
    }

    public boolean search(String word) {
        return searchRecursive(root, word);
    }

    private boolean searchRecursive(BSTNode<BSTData> current, String word) {
        if (current == null) {
            return false;
        }

        int comparison = word.compareTo(current.data.getWord());

        if (comparison == 0) {
            return true;
        } else if (comparison < 0) {
            return searchRecursive(current.left, word);
        } else {
            return searchRecursive(current.right, word);
        }
    }

}
