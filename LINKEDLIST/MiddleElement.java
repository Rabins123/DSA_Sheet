package LINKEDLIST;

import java.util.Scanner;

public class MiddleElement {
    
    public  Node middleElement(Node head){
          Node slow=head;
          Node fast=head;
          while(fast !=null && fast.next !=null){
            slow =slow.next;
            fast=fast.next.next;
          } 
          return slow; 
    }


    //main function
    public static void main(String[] args) {
      MiddleElement ml=new MiddleElement();
      
      TakeInputLL ll = new TakeInputLL();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        while (n != -1) {
            ll.takeInput(n);
            n = sc.nextInt();
        }
        sc.close();

        System.out.println("Printing the original linked list: ");
        Node temp = ll.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        //call the middle function
        Node ans=ml.middleElement(ll.head);
        System.out.println("Middle element is : "+ ans.data);
        
    }
}
