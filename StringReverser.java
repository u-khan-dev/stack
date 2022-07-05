public class StringReverser {
    protected String string;

    public StringReverser(String inputString) {
        string = inputString;
    }

    public String reverseString() {
        ArrayStack<Character> stack = new ArrayStack<>();
        int length = string.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++)
            stack.push(string.charAt(i));

        for (int j = 0; j < length; j++)
            sb.append(stack.pop());

        return sb.toString();
    }
}
