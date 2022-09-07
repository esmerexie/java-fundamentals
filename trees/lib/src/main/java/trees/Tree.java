package trees;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tree <A> {
    public Node<A> root = null;

    public Tree(Node<A> root) {
        this.root = root;
    }

    public ArrayList<A> preOTraversal(){
        ArrayList<A> arrayList = new ArrayList<>();
        preOrder(arrayList, root);
        return arrayList;
    }

}
