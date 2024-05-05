package Core;

import java.util.Iterator;

/**
 *
 * @author zahid
 */
public class MyLinkedList<T> implements Iterable<T> {

    protected MyLinkedListNode<T> head;
    private int size;

    public void addLast(T data) {
        MyLinkedListNode<T> newNode = new MyLinkedListNode<>(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        MyLinkedListNode<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    public boolean contains(T data) {
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

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyLinkedListIterator();
    }

    private class MyLinkedListIterator implements Iterator<T> {

        private MyLinkedListNode<T> current;

        public MyLinkedListIterator() {
            this.current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new RuntimeException("No more elements");
            }
            T data = current.data;
            current = current.next;
            return data;
        }
    }

}
