//Q15.Write a Java program to check whether vehicle speed exceeds 100 km/h.

import java.util.*;
public class SpeedCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int speed = sc.nextInt(); // speed in km/h

        if(speed > 100)
            System.out.println("Speed Exceeds 100 km/h");
        else
            System.out.println("Speed is Safe");
    }
}
