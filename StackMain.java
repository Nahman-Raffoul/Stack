package stack;

public class StackMain {

    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 1; i <= 5; i++) {
            stack.addToBeginning(i);
        }
        stack.print();
    }

}
