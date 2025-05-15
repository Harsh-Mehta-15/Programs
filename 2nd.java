// 2.WAP to find whether string is palindrome or not.

import java.util.Scanner;

class Second{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //For Digit
        System.out.print("Enter a Number ");
        int num = sc.nextInt();
        int orig=num;
        int rev = 0 , rem = 0;
        while(num != 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if(orig==rev){
            System.out.println(rev + " is a Palindrome");
        } else {
            System.out.println(rev + " is not a Palindrome");
        }
        
        //For String
        System.out.print("Enter a String ");
        String str = sc.next();
        String rev_str = "";
        for(int i = str.length() - 1 ; i >= 0 ; i--){
            rev_str += str.charAt(i);
        }

        if(str.equalsIgnoreCase(rev_str)){
            System.out.println(rev_str + " is a palindrome");
        }else{
            System.out.println(rev_str + " is not a palindrome");
        }
    }
}
