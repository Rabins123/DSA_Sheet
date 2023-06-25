package String;

public class reverseString {

    // ------------------------------------------------------Using// Swapping-----------------------------------------------
    public static void reverse1(String s) {
        char cha[] = s.toCharArray();
        int i = 0;
        int j = cha.length - 1;
        while (i < j) {
            char temp = cha[i];
            cha[i] = cha[j];
            cha[j] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < cha.length; k++) {
            System.out.print(cha[k]);
        }
    }

    //

    // main function
    public static void main(String[] args) {
        String str1 = "Rabins";
        String str2 = "chaudhary";

        // call the function
        System.out.print("Reverse string is : ");
        reverse1(str1);
        System.out.println();
        System.out.print("Reverse string is : ");
        reverse1(str1);
    }
}
