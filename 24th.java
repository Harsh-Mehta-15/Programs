// 24.WAP to delete an element from array specified by user. if element is not found print a 
//msg “Element is not found” (do not take a new array).

import java.util.*;

class Twenty_Four {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Size of Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " Element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is : " + Arrays.toString(arr));

        System.out.print("Enter a Element would you want to delete : ");
        int del_ele = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == del_ele) {
                found = true;
                for (int j = i; j < size; j++) {
                    arr[j] = arr[j + 1];
                }
                size--;
                break;
            }
        }

        if (!found) {
            System.out.println("Element is not found");
        } else {
            System.out.println("After Deletion : " + Arrays.toString(arr));
        }
    }
}
