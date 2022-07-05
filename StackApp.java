public class StackApp {
    public static void main(String[] args) {

        /* **************************
            Stack implemented using an array
         */

        ArrayStack<Character> as = new ArrayStack<>();
        System.out.println(as);

        as.push('A');
        System.out.println(as);

        as.push('B');
        as.push('C');
        as.push('D');
        as.push('E');
        System.out.println(as);

        as.pop();
        System.out.println(as);

        System.out.println(as.top());
        System.out.println(as);

        StringReverser sr = new StringReverser("reverse");
        System.out.println(sr.reverseString());

        /* **************************
            Stack implemented using a Singly Linked List
         */

        ListStack<Integer> ls = new ListStack<>();
        System.out.println(ls);

        ls.push(1);
        System.out.println(ls);

        System.out.println(ls.size());

        ls.push(3);
        ls.push(4);
        ls.push(5);
        System.out.println(ls);
        System.out.println(ls.size());
        System.out.println(ls.isEmpty());

        ls.pop();
        System.out.println(ls);
    }
}
