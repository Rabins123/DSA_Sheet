package LINKEDLIST;

import java.util.Scanner;

//add1 to the linked list

/*
 Input:
LinkedList: 4->5->6
Output: 457 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
 */

public class Add1 {

    private static Node add1(Node head, int k) {
        head = reverse(head);
        Node curr = head;
        int carry = k;
        while (curr != null) {
           int sum=curr.data+ k;
           curr.data=sum%10;
           carry=sum/10;

           if(carry==0){
            break;
           }
           if (curr.next == null) {
            Node newNode = new Node(carry);
            curr.next = newNode;
            break;
        }
           curr=curr.next;
        }

        // if(carry>0){
        //     Node newNode=new Node(carry);
        //     curr.next=newNode;

        // }

        head= reverse(head);
        return head;
    }

    // reverse the linkedlist
    private static Node reverse(Node head) {

        Node prev = null;
        Node curr = head;
        Node forward = null;
        while (curr != null) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }

    public static void main(String[] args) {

        TakeInputLL ll = new TakeInputLL();
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.println("Enter the number which need to be added : ");
        int k=sc.nextInt();

        System.out.println();
        System.out.println("Enter the element of LinkedList : ");
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
        Node Head = add1(ll.head, k);
        temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

}
