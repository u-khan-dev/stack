public class Node<T> {
    private final T element;
    private final Node<T> next;

    public Node(T elem, Node<T> nextNode) {
        element = elem;
        next = nextNode;
    }

    T getElement() { return element; }
    Node<T> getNext() { return next; }
}
