//Q9.Write a Java Program to find Perimeter of a Rectangle

import java.util.*;
public class Pr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double p = 2 * (l+b);

        System.out.println(p);
    }
}

