package trees;

public class Node <A> {
    public A value;
    public Node<A> left = null;
    public Node<A> right = null;

    public Node(){
    }

    public Node(A value) {
        this.value = value;
    }
}
