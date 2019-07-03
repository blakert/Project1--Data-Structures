public class DList <T> {

    private Node head;
    public long size;

    DList() {
        head = new Node();
        head.next = head;
        head.prev = head;
        head.item = Integer.MIN_VALUE;
        this.size = 0;
    }

    DList(T item) {
        head = new Node();
        head.item = null;

        head.next = new Node(item);
        head.prev = head.next;

        head.next.next = head;
        head.next.prev = head;
        this.size = 1;

    }

    // add front
    public void addFront(T item) {
        Node temp = head.next;
        head.next = new Node(item);
        head.next.prev = head;
        head.next.next = temp;
        temp.prev = head.next;
        this.size++;
    }

    // remove front
    public void removeFront() {
      if (head == head.next )  return;

      head.next = head.next.next;
      head.next.prev = head;
      this.size--;
    }
    // add back
    public void addBack (T item) {
        // last node - head.prev

    }
    // remove back
    public boolean isEmpty() {
        return this.size == 0;
    }
}
