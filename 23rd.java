// 23.WAP to enter an element at specific position into array. (Do not take a new array)

import java.util.*;

class Twenty_Three {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter number of elements (less than " + size + "): ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " Element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is : " + Arrays.toString(arr));

        System.out.print("Enter New Element : ");
        int new_ele = sc.nextInt();
        System.out.print("Enter position (1 to " + size + "): ");
        int pos = sc.nextInt();

        if (pos <= 0 || pos > n || pos >= size) {
            System.out.println("Invalid Position");
        } else {
            for (int i = n; i > pos; i--) {
                arr[i] = arr[i - 1];
            }
            arr[pos] = new_ele;
            n++;
            System.out.println("Array after insertion:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        //System.out.println("After Added Element: " + Arrays.toString(arr));
    }
}
