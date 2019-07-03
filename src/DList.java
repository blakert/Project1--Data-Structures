public class DList <T> {
    class Node <T> {
        Node next;
        Node prev;
        private T item;

        Node(T item) {
            this.item = item;
            this.next = null;
            this.prev = null;
        }

        Node() {
            this.item = null;
            this.next = null;
            this.prev = null;
        }

        public T getItem() {
            return item;
        }
        public void setItem(T item) {
            this.item = item;
        }
        public Node getNext() {
            return this.next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
        public Node getPrev() {
            return this.prev;
        }
        public void setPrev (Node prev) {
            this.prev = prev;
        }
    }
    private Node head;
    public long size;

    DList() {
        head = new Node();
        head.next = head;
        head.prev = head;
        head.item = Integer.MIN_VALUE;
    }

    DList(T item) {
        head = new Node();
        head.item = null;

        head.next = new Node(item);
        head.prev = head.next;

        head.next.next = head;
        head.next.prev = head;

    }

    // add front
    public void addFront(T item) {
        Node temp = head.next;
        head.next = new Node(item);
        head.next.prev = head;
        head.next.next = temp;
        temp.prev = head.next;
        size++;
    }

    // remove front
    public void removeFront() {
      if (head == head.next )  return;

      head.next = head.next.next;
      head.next.prev = head;
      size--;
    }
    // add back
    public void addBack (T item) {
        // last node - head.prev

    }
    // remove back

}
