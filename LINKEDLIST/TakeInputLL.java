package LINKEDLIST;

public class TakeInputLL {

    //head of the linkedList
    Node head;
    
    //function for taking input from the user
    public Node takeInput(int x){
        //create node
        Node newNode=new Node(x);
        // Node tail=head;

        if(head==null){
            head=newNode;
        }
        else if(head.next==null){
            head.next=newNode;
        }
        else{
           Node temp=head;
           while (temp.next!=null){
            temp=temp.next;
           }
            temp.next=newNode;
           
        }
       return head;
    }
}
