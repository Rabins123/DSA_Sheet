package LINKEDLIST;

import java.util.Scanner;

public class MoveLastNodeToFront {
    
  private static Node move(Node head) {
            Node temp=head;
            while (temp.next.next !=null){
                temp=temp.next;
            }
            temp.next.next=head;
            head=temp.next;
            temp.next=null;
            return head;
        }


    //main function
     public static void main(String[] args) {
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

        System.out.println("\nPrinting the new linked list: ");
        Node Head = move(ll.head);
        temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
      

    }
}
