//Q10.Write a Java program to print "Stop / Ready / Go" based on traffic light color.

import java.util.*;
public class TrafficLight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String color = sc.next();

        switch(color.toLowerCase()){
            case "red":
                System.out.println("Stop");
                break;

            case "yellow":
                System.out.println("Ready");
                break;

            case "green":
                System.out.println("Go");
                break;

            default:
                System.out.println("Invalid Color");
        }
    }
}
