package LINKEDLIST;

import java.util.Scanner;

public class MiddleElement {
    


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
        
    }
}
