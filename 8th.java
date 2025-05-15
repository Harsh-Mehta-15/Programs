// 8.WAP to find a total odd and total even digit of a given number. 

import java.util.*;

class Eight{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int even = 0, odd = 0;
        while(num != 0){
            int rem = num % 10;
            if(rem % 2 == 0){
                even++;
            } else {
                odd++;
            }
            num = num / 10;
        }
        System.out.println("Total Odd Numbers are " + odd);
        System.out.println("Total Even Numbers are " + even);
    }
}