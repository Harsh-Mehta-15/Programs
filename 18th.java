// 18.WAP to sort an Array using Selection sort.

import java.util.*;

class Eightteen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " Element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is :" + Arrays.toString(arr));

        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("After Selection sort : " + Arrays.toString(arr));
    }
}
