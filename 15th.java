// 15.WAP to convert a Decimal number to BCD(Binary Coded Decimal).

import java.util.*;

class Fifthteen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number : ");
        int decimal = sc.nextInt();
        String decimal_str = String.valueOf(decimal);
        System.out.print("BCD is : ");
        for(int i = 0; i < decimal_str.length(); i++){
            char digit_char = decimal_str.charAt(i);
            int digit = Character.getNumericValue(digit_char);
            String binary = Integer.toBinaryString(digit);
            String bcd = String.format("%4s", binary).replace(" ", "0");
            System.out.print(bcd + " ");
        }
    }
}