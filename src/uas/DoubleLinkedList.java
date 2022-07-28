package uas;

public class DoubleLinkedList<T> {
    Node<T> head, tail;
    int size;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(T item) {
        if (isEmpty()) {
            head = new Node<T>(null, item, null);
            tail = head;
        } else {
            Node<T> newNode = new Node<T>(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(T item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node<T> newNode = new Node<T>(tail, item, null);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    // public void add(T item, int index) {
    //     if (index == 0) {
    //         addFirst(item);
    //     } else if (index == size + 1) {
    //         addLast(item);
    //     } else {
    //         Node<T> current = head;
    //         for (int i = 1; i < index; i++) {
    //             current = current.next;
    //         }
    //         Node<T> newNode = new Node<T>(current.prev, item, current);
    //         current.prev.next = newNode;
    //         current.prev = newNode;
    //         size++;
    //     }
    // }

    public T removeFirst() {
        if (!isEmpty()) {
            T item = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            } else {
                head.prev = null;
            }
            size--;
            return item;
        } else {
            return null;
        }
    }

    public T removeLast() {
        if (!isEmpty()) {
            T item = tail.data;
            tail = tail.prev;
            if (tail == null) {
                head = null;
            } else {
                tail.next = null;
            }
            size--;
            return item;
        } else {
            return null;
        }
    }

    // public T remove(int index) {
    //     if (index == 1) {
    //         return removeFirst();
    //     } else if (index == size) {
    //         return removeLast();
    //     } else {
    //         Node<T> current = head;
    //         for (int i = 1; i < index; i++) {
    //             current = current.next;
    //         }
    //         T item = current.data;
    //         current.prev.next = current.next;
    //         current.next.prev = current.prev;
    //         size--;
    //         return item;
    //     }
    // }

    public void print() {
        if (!isEmpty()) {
            Node<T> current = head;
            System.out.println("~~Cetak Data~~");
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        } else {
            System.out.println("List masih kosong");
        }
    }
}
