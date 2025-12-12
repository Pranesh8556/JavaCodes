//Q12.Write a Java Program to find Surface Area, Volume, and Perimeter of a Cube

import java.util.*;
public class Cube {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        double perimeter = 12 * side; 
        System.out.println(perimeter);
    }
}