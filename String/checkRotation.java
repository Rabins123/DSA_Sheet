package String;

public class checkRotation {
    


    //main function
    public static void main(String[] args) {
        String s1="rabins";
        String s2="abinsr";

        //call the function
        boolean ans1= isRotationOfOther(s1, s2);
        System.out.println("Is s2 rotation of s1 ?" + ans1);

    }
//-----------------------------Using Concatenation-------------------------------------------------------------------------------
//tc-
//sc-
    public static boolean isRotationOfOther(String s1, String s2) {

        String str= s1+s1;
        return str.contains(s2);
    }
}
