package linked.list;

public class LinkedList<T>{

    //Thanks to Mandy for helping me out! and referencing her code

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
            output += "{ " + current.value + " } -> ";
            current = current.next;
        }
        return output + "Null";
    }

    public void append(T value){
        Node<T> newTail = new Node<>(value);

        if(head == null){
            newTail.next = null;
            head = newTail;
        } else {
            Node<T> current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newTail;
            newTail.next = null;
        }
    }

    public void insertBefore(T givenValue, T newValue){

        Node<T> newNode = new Node<T>(newValue);
        Node<T> current = head;

        while (current.next != null){
            if(current.next.value == givenValue){
                newNode.next = current.next;
                current.next = newNode;
                listSize++;
                break;
            } else {
                current = current.next;
            }
        }
    }

    public void insertAfter(T givenValue, T newValue){
        Node<T> newNode = new Node<T>(newValue);
        Node<T> current = head;

        while (current.next != null){
            if(current.value == givenValue){
                newNode.next = current.next;
                current.next = newNode;
                listSize++;
                break;
            }
            current = current.next;
        }
    }

}
