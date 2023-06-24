package Array;

import java.util.ArrayList;
import java.util.LinkedList;

//factorial of large number


public class factOfLargeNum{
   
//---------------------------------------------------------Using LinkedList----------------------------------------------------
//tc-O(n^2)
//sc-O(n)
 public static LinkedList<Integer> calculateFactorialUsingLinkedList(int n) {
        LinkedList<Integer> factorial = new LinkedList<>();
        factorial.add(1); // Initialize factorial with 1

        for (int i = 2; i <= n; i++) {
            multiply(factorial, i);
        }

        return factorial;
    }

    private static void multiply(LinkedList<Integer> number, int factor) {
        int carry = 0;
        for (int i = 0; i < number.size(); i++) {
            int product = number.get(i) * factor + carry;
            number.set(i, product % 10);
            carry = product / 10;
        }

        while (carry != 0) {
            number.add(carry % 10);
            carry /= 10;
        }
    }

   


//---------------------------------------------------------Using ArrayList----------------------------------------------------
//tc- O(n^2)
//sc-O(n)
    
 public static ArrayList<Integer> calculateFactorialUsingArraylist(int n) {
        ArrayList<Integer> factorial = new ArrayList<>();
        factorial.add(1); // Initialize factorial with 1

        for (int i = 2; i <= n; i++) {
            multiply(factorial, i);
        }

        return factorial;
    }

    private static void multiply(ArrayList<Integer> number, int factor) {
        int carry = 0;
        for (int i = 0; i < number.size(); i++) {
            int product = number.get(i) * factor + carry;
            number.set(i, product % 10);
            carry = product / 10;
        }

        while (carry != 0) {
            number.add(carry % 10);
            carry /= 10;
        }
    }


    //main function

    public static void main(String[] args) {
        

        //calling the function
         int n = 5;

         //call the function
        LinkedList<Integer> factorial1 = calculateFactorialUsingLinkedList(n);

        System.out.print("Factorial of " + n + ": ");
        for (int i = factorial1.size() - 1; i >= 0; i--) {
            System.out.print(factorial1.get(i));
        }


        //call arraylist wal,a funmction
         ArrayList<Integer> factorial2 = calculateFactorialUsingArraylist(n);

        System.out.print("Factorial of " + n + ": ");
        for (int i = factorial2.size() - 1; i >= 0; i--) {
            System.out.print(factorial2.get(i));
        }
    }
}