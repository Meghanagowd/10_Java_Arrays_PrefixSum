import java.util.Scanner;

public class EquilibriumPoint {

    public static int findEquilibrium(long[] arr) {

        long totalSum = 0;

        // Step 1: Calculate total sum
        for(int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        long leftSum = 0;

        // Step 2: Traverse and check equilibrium
        for(int i = 0; i < arr.length; i++) {

            long rightSum = totalSum - leftSum - arr[i];

            if(leftSum == rightSum) {
                return i + 1;  // 1-based indexing
            }

            leftSum += arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        long[] arr = new long[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        int result = findEquilibrium(arr);

        if(result != -1)
            System.out.println("Equilibrium Position: " + result);
        else
            System.out.println("No Equilibrium Point");

        sc.close();
    }
}