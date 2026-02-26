import java.util.Scanner;

public class ArraySortedOrNot {

    public static boolean isSorted(int[] arr) {

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if(isSorted(arr)) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is Not Sorted");
        }

        sc.close();
    }
}