class LinkedList {
    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        var curr = head;
        for (var i = 0; i < index; i++) {
            curr = curr.next;
        }

        return curr.value;
    }

    public void insertHead(int val) {
        var newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertTail(int val) {
        var newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            return false;
        }

        if (index == 0) {
            head = head.next;
            if (head == null)
                tail = null;
        } else {
            var curr = head;
            for (var i = 0; i < index - 1; i++) {
                curr = curr.next;
            }

            curr.next = curr.next.next;
            if (curr.next == null) {
                tail = curr;
            }
        }
        size--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        var values = new ArrayList<Integer>();
        var curr = head;
        while (curr != null) {
            values.add(curr.value);
            curr = curr.next;
        }

        return values;
    }
}
