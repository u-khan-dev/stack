public interface Stack<T> {
    void push(T element) throws FullStackException;
    T pop() throws EmptyStackException;
    int size();
    boolean isEmpty();
    T top() throws EmptyStackException;
}
