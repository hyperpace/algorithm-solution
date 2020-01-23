package datastructer.basic;

public class MyList {
    static class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }

        void appendToTail(Object data) {
            Node end = new Node(data);
            Node current = this;
            while (current.next != null) {
                current = current.next;
            }
            current.next = end;
        }

        Node deleteNode(Node head, Object data) {
            Node currentNode = head;

            if (currentNode.data.equals(data)) {
                return head.next;
            }

            while (currentNode.next != null) {
                if (currentNode.next.data.equals(data)) {
                    currentNode.next = currentNode.next.next;
                    return head;
                }
                currentNode = currentNode.next;
            }

            return head;
        }

        boolean deleteNode(Node node) {
            if (node == null || node.next == null) {
                return false;
            }
            Node nextNode = node.next;
            node.data = nextNode.data;
            node.next = nextNode.next;

            return true;
        }

        Node nthToLast(Node head, int k, IntegerWrapper i) {
            if (head == null) {
                return null;
            }

            Node node = nthToLast(head.next, k, i);
            i.value = i.value + 1;
            if (i.value == k) {
                return head;
            }

            return node;
        }

        Node nthNode(Node head, int k) {

            Node current = head;
            for (int i = 1; i <= k; i++) {
                current = current.next;
                if (current == null) {
                    return null;
                }
            }

            return current;
        }
    }
}

class IntegerWrapper {
    public int value = 0;
}
