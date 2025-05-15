// 20.WAP to find a power a^b (without using power and multiplication operation).

import java.util.*;

class Twenty{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        System.out.print("Enter a Power of Number : ");
        int power = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= power; i++) {
            result += num;
        }
        
        System.out.println("Result is : " + result);
    }
}