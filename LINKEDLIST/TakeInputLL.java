package LINKEDLIST;

public class TakeInputLL {

    Node head;

    // Function for taking input from the user
    public void takeInput(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    
}
