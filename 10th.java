// 10.WAP to find a prime number between range (range should be entered by user).

import java.util.*;

class Ten {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Starting Range : ");
        int start = sc.nextInt();
        System.out.print("Enter a Ending Range : ");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            boolean flag=true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Prime Numbers are " + i);
            }
        }
    }
}
