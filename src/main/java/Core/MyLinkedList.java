package Core;

/**
 *
 * @author zahid
 */
public class MyLinkedList<T> {

    protected MyLinkedListNode<T> head;
    private int size;

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
        size++;
    }

    public void addFirst(T data) {
        MyLinkedListNode<T> newNode = new MyLinkedListNode<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
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
        size++;
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

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }

        MyLinkedListNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void display() {
        MyLinkedListNode<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

}
