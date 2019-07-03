public class Node<T> {
    Node<T> next;
    Node<T> prev;
    T item;

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

