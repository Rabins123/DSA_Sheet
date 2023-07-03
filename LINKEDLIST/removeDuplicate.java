package LINKEDLIST;
//remove duplicte in sorted linkedlist

import java.util.Scanner;

public class removeDuplicate {

    public static Node remove(Node head) {
        Node temp1 = head;
        Node temp2 = head;
        while (temp2 != null) {
            if (temp1.data == temp2.data) {
                temp1.next = temp2.next;
                temp2 = temp2.next;
            } else {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        return head;
    }

    // main function
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
        Node Head = remove(ll.head);
        temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
