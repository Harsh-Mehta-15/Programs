// 7.WAP to find a Fibonacci series up to n terms (n is entered by user) (iterative and recursive)

import java.util.Scanner;

class Seven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a End Number");
        int end_num = sc.nextInt();
        int first=0,second=1;
        System.out.print("Fibonacci series is ");
        for(int i=1;i <= end_num; i++){
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;   
        }
    }
}