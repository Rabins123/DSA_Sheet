package LINKEDLIST;

import java.util.Scanner;

public class reverseLL {

    // ------------------------------------------iteratively--------------------------------------
    // tc-0(n)
    // sc-0(1)
    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node previous = null;
        Node current = head;
        Node forward = null;

        while (current != null) {
            forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }
        return previous;
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

        System.out.println("\nPrinting the reversed linked list: ");
        Node Head = reverse(ll.head);
        temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
