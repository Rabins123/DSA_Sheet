package Array;

//Check all element of array is palindome or not

/*
 Input:
5
111 222 333 444 555

Output:
1

Explanation:
A[0] = 111 //which is a palindrome number.
A[1] = 222 //which is a palindrome number.
A[2] = 333 //which is a palindrome number.
A[3] = 444 //which is a palindrome number.
A[4] = 555 //which is a palindrome number.
As all numbers are palindrome so This will return 1.
 */

public class PalindomicArray {

    public static int palinArray(int[] a, int n) {
        // add code here.

        boolean flag = true;
        ;

        for (int i = 0; i < a.length; i++) {
            if (!isPalindrome(a[i])) {
                flag = false;
                break;
            }

        }
        if (flag == false) {
            return 0;
        } else {
            return 1;
        }

    }

    public static boolean isPalindrome(int num) {
        if (num < 10) {
            return true;
        }
        int temp = num;
        int reverse = 0;
        while (temp != 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }
        return reverse == num;
    }

    // main function
    public static void main(String[] args) {
        int arr[] = { 111, 222, 333, 444, 555 };
        int n = arr.length;

        // call the function
        int ans1 = palinArray(arr, n);
        System.out.println(ans1);
    }

}
