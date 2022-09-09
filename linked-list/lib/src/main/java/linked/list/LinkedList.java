package linked.list;

public class LinkedList<T>{

    //Thanks to Mandy for helping me out!
    
    public Node<T> head = null;
    public int listSize = 0;


    public void insert(T value){
        Node<T> newHead = new Node<T>(value);
        newHead.next = head;
        head = newHead;
        listSize++;
    }

    public boolean includes (T value) {
        Node<T> current = head;
        while(current != null){
            if(current.value == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public String toString()
    {
        String output = "";
        Node<T> current = head;
        while(current != null){
            output += "{ " + current.value + "} ->";
            current = current.next;
        }
        return output + "Null";
    }
}
