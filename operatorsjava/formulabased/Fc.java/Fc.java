//Q6.Write a Java Program to calculate Fahrenheit to Javaelsius

import java.util.*;
public class Fc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double f = sc.nextDouble();

        double c =  (f-32)*(5.0/9.0);

        System.out.println(c);
    }
}
