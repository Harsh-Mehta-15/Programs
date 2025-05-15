// 12.WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value
//should be taken from user (Note that you are not allowed to use an array for this)

import java.util.*;

class Twelve{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How Many Numbers you want to Enter: ");
        int n = sc.nextInt();
        float num ,min ,max ,sum ,avg;

        System.out.print("Enter 1 Number : ");
        num = sc.nextFloat();
        min = max = sum = num;
        for(int i = 1 ; i < n ; i++){
            System.out.print("Enter " + (i+1) + " Number :");
            num = sc.nextFloat();
            if(num < min){
                min = num;
            }

            if(num > max){
                max = num;
            }
            
            sum += num;
        }
        System.out.println("Minimum Number is : " + min);
        System.out.println("Maximun Number is : " + max);
        avg = sum / n ;
        System.out.println("Average is : " + avg);
    }
}
