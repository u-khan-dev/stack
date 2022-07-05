public class ListStack<T> implements Stack<T> {
    protected Node<T> top;
    protected int size;

    public ListStack() {
        top = null;
        size = 0;
    }

    public int size() { return size; }

    public boolean isEmpty() { return top == null; }

    public void push(T element) {
        top = new Node<>(element, top);
        size++;
    }

    public T pop() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException("Stack is empty.");
        T poppedNode = top.getElement();
        top = top.getNext();
        size--;

        return poppedNode;
    }

    public T top() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException("Stack is empty.");
        return top.getElement();
    }

    @Override
    public String toString() {
        StringBuilder s = isEmpty() ? new StringBuilder("[ ") : new StringBuilder("[top: ");
        Node<T> curr = top;

        if (size() > 0) s.append(top());

        if (size() > 1)
            for (int i = 1; i < size(); i++) {
                curr = curr.getNext();
                s.append(" -> ");
                s.append(curr.getElement());
            }

        return s + " ]";
    }
}
