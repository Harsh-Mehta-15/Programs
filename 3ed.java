//WAP to find a Factor of a given number (iterative and recursive)

import java.util.*;

class Third{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        System.out.println(num + "'s Factorial By Iterative are ");

        //iterative
        for(int i = 1; i <= num ; i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }

        //recursive
        System.out.println(num + "'s Factorial By Recursive are ");
        recursive(num, 1);
    }

    //recursive
    public static void recursive(int num , int i) {

        if (i > num) {
            return;
        }
        
        if(num % i == 0){
            System.out.print(i + " ");
        }

        recursive(num, i+1);
    }
}