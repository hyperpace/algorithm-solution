package datastructer.basic;

public class MyQueue {
    static class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }
    }

    private Node first, last;

    void enqueue(Object item) {
        if (first == null) {
            last = new Node(item);
            first = last;
        } else {
            last.next = new Node(item);
            last = last.next;
        }
    }

    Object dequeue() {
        if (first != null) {
            Object item = first.data;
            first = first.next;
            return item;
        }
        return null;
    }
}
