package Array;

public class tripletSum {

    // --------------------------------------------------------Brute force
    // method-------------------------------
    // tc-0(N*N*N)
    // sc-0(1)
    private static boolean isPresent1(int[] arr, int x) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum == x) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // ------------------------------------------------Sorting ansd two pointer
    // method-------------------------------
    // tc-0(N*N*)
    // sc-0(1)

    // main function
    public static void main(String[] args) {
        int[] arr = { 10, 20, 90, 110, 70, 60, 80, 40 };
        int x = 220;

        // call, the function
        boolean ans1 = isPresent1(arr, x);
        System.out.println("Triplet sum is present or not : " + (ans1 ? "Yes Present " : "No Not Present"));
        System.out.println();

        // boolean ans2= isPresent2(arr, x);
        // System.out.println( "Triplet sum is present or not : "+(ans2 ? "Yes Present
        // ": "No Not Present"));
        // System.out.println();
    }

}