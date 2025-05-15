// 14.WAP to calculate an angle between hour and minute hand. (Hours and minutes should be taken from user).

import java.util.*;

class Fourteen{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hour : ");
        int hour = sc.nextInt();
        System.out.print("Enter a Minute : ");
        int min = sc.nextInt();
        float h = (hour%12 + (float)min/60)*30; //360/12
        float m = min*6; //360/60
        float angle = Math.abs(h-m);
        if(angle > 180){
            angle = 360 - angle;
            System.out.println("Angle is : " + angle);
        }
    }
}