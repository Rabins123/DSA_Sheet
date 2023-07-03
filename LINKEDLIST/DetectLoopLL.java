package LINKEDLIST;

import java.util.Scanner;

public class DetectLoopLL {
    
public static boolean detectLoop(Node head){
        // Add code here
        Node fast=head;
        Node slow= head;
        boolean flag=false;
        while(fast!=null && fast.next !=null){
            // if(slow==fast){
            //     flag=true;
            //     break;
            // }
            slow=slow.next;
            fast=fast.next.next;
             if(slow==fast){
                flag=true;
                break;
            }
        }
        return flag;
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

        //call the function
        System.out.println();
        boolean ans1=detectLoop(ll.head);
        System.out.println("Is loop present in LinkedList : "+ (ans1 ? "Yes" : "No"));
    }
}
