package Java;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortImpl {
   public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter size of array input: ");
        int size = sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr = new int[size];
        int i = 0;
        while (sc.hasNextInt()) {
            arr[i++] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr);
    } catch (Exception e) {
        System.err.println(e.getLocalizedMessage());
    }
   } 
}
