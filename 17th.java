// 17.WAP to sort an Array using insertion sort

import java.util.*;

class Seventeen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];       // The element to be inserted
            int j = i - 1;

            // Shift elements greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key in the correct position
            arr[j + 1] = key;
        }

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}