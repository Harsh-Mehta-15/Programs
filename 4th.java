//4.WAP to find a factorial of a given integer (iterative and recursive)

import java.util.*;

class Fourth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        //iterative
        int fact = 1;
        System.out.print("Factorial of " + num + " are ");
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            for(int i = 1 ; i<=num ; i++ ){
                fact*=i;
            }
            System.out.println(fact + " ");

            recursive(num);
            System.out.println(num + " ");
            
        }
    }

     //recursive
        public static int recursive(int num){
            if(num==0 || num ==1){
                return 1;
            } else {
                num=num*recursive(num-1);
                System.out.println(num + " ");
                return num;
                
            }
            
        }
}