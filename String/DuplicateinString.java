package String;

// import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateinString {

    // main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        sc.close();

        //call the function
        duplicateCharacter1(str);
    }

    //----------------------------------------------Using hashSet-----------------------------------------------------------------
    //tc-
    //sc-
    public  static void duplicateCharacter1(String str) {

        HashSet<Character>set=new HashSet<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char c=str.charAt(i);
            if(set.contains(c)){
                System.out.print(c+" ");
            }
            set.add(c);
        }
    }

     //----------------------------------------------Using hashSet-----------------------------------------------------------------
    //tc-
    //sc-
    // public  static void duplicateCharacter2(String str) {

    //     HashMap<Character,Integer>map=new HashMap<>();
    //     int n=str.length();
    //     for(int i=0;i<n;i++){
    //         char c=str.charAt(i);
    //         if(map.contains(c)){
    //             System.out.print(c+" ");
    //         }
    //         map.add(c);
    //     }
    // }
}
