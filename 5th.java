//5.WAP to find a summation of a digit of a given number. (Iterative and recursive) 

import java.util.*;

class Five{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int rem = 0 , sum=0;

        //Iterative
        while(num != 0){
            rem = num % 10;
            sum += rem;
            num = num/10;
        }
        System.out.println("Summation by Iterative is : " +sum);

        //recursive
        int rec = recursive(num);
        System.out.println("Summation by Recursive is : " + rec);
    }

    public static int recursive(int num) {
        if (num == 0)
        {
            return 0;
        } else {
            return (num % 10) + recursive(num / 10);
        }
    }
}