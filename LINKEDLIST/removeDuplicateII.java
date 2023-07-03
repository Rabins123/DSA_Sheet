package LINKEDLIST;

import java.util.Scanner;

//renove duplicate from unsortedlist -gfg

/*
 N = 4
value[] = {5,2,2,4}
Output: 5 2 4
Explanation:Given linked list elements are
5->2->2->4, in which 2 is repeated only.
So, we will delete the extra repeated
elements 2 from the linked list and the
resultant linked list will contain 5->2->4

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
 */

public class removeDuplicateII {

    private static Node removeII(Node head) {
        return null;
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
        Node Head = removeII(ll.head);
        temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

}
