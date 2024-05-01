package Core;

/**
 *
 * @author zahid
 */
public class MyLinkedList<T> {

    protected MyLinkedListNode<T> head;

    public MyLinkedList() {
        this.head = null;
    }

    public void addLast(T data) {
        MyLinkedListNode<T> newNode = new MyLinkedListNode<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        MyLinkedListNode<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void addFirst(T data) {
        MyLinkedListNode<T> newNode = new MyLinkedListNode<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addAfterData(T prevData, T newData) {
        MyLinkedListNode<T> newNode = new MyLinkedListNode<>(newData);
        MyLinkedListNode<T> current = head;
        while (current != null && !current.data.equals(prevData)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Önceki veri bulunamadı.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public boolean contains(String data) {
        MyLinkedListNode<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void display() {
        MyLinkedListNode<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }

}
