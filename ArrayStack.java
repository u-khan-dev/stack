public class ArrayStack<T> implements Stack<T> {
    protected int capacity;
    public static final int CAPACITY = 500;
    protected T[] stack;
    protected int top = -1;

    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int cap) {
        capacity = cap;
        stack = (T[])new Object[capacity];
    }

    public int size() { return top + 1; }

    public boolean isEmpty() { return top < 0; }

    public void push(T element) throws FullStackException {
        if (size() == capacity) throw new FullStackException("Stack is full.");
        stack[++top] = element;
    }

    public T pop() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException("Stack is empty.");
        T element = stack[top];
        stack[top--] = null;
        return element;
    }

    public T top() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException("Stack is empty.");
        return stack[top];
    }

    @Override
    public String toString() {
        StringBuilder s;

        s = new StringBuilder("[ ");

        if (size() > 0) s.append(stack[0]);

        if (size() > 1)
            for (int i = 1; i < size(); i++)
                s.append(", ").append(stack[i]);

        if (size() == 0) {
            s.append(" ]");
        } else {
            s.append(" : top ]");
        }

        return s.toString();
    }
}
