package Core;

/**
 *
 * @author zahid
 */
public class MyLinkedListNode<T> {

    T data;
    MyLinkedListNode<T> next;

    public MyLinkedListNode(T data) {
        this.data = data;
        this.next = null;
    }

}
