package Core;

/**
 *
 * @author zahid
 */
public class BSTNode<T extends Comparable<T>> {

    T data;
    BSTNode<T> left, right;

    public BSTNode(T data) {
        this.data = data;
    }

}
