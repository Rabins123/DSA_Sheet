package String;

import java.util.Scanner;

public class checkPalindrome {
    
   //------------------------------------------------Two Pointer--------------------------------------------------------------------
   //tc-
   //sc-
    public static boolean isPalindrome1(String str) {
        int i=0;
        int j=str.length()-1;
        boolean flag=true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag=false;
                break;
                // return false;
            }
            i++;j--;
        }
        return flag;
        // return true;
    }


    //main function
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String : ");
    String str=sc.nextLine();
    sc.close();

    //call the function
    boolean ans1=isPalindrome1(str);
    System.out.println("Is palindome ? : "+ans1);
    }

   
}
