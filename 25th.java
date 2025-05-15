// 25.WAP to check weather number is present in array or not (using recursion only) and 
//the function’s syntax is given below
//Int isInArray(int a[],int m);
//Where int a[] is Array of integer and m is element to be searched. 

import java.util.*;

class Twenty_Five {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + " Element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is : " + Arrays.toString(arr));

        
    }
}
