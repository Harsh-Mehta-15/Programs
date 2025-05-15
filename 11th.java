// 11.WAP to find weather given number is Armstrong number is not. 

import java.util.*;

class Eleven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while(num > 0){
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        if(original == sum){
            System.out.println( original + " is a Armstrong Number");
        } else {
            System.out.println( original + " is not a Armstrong Number");
        }
    }
}

