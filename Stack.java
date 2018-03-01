package stack;

public class Stack {

    Node root;

    Stack() {
    }

    void addToBeginning(int data) {
        Node tmp = new Node();
        tmp.data = data;
        tmp.next = root;
        root = tmp;
    }

    void print() {
        Node tmp = root;
        if (tmp == null) {
            System.out.println("root of list is empty");
        }
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
        System.out.println("");
    }
}
