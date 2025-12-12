//Q5.Write a Java program to check if temperature is above 100 (fever check).

import java.util.*;
public class FeverCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double temp = sc.nextDouble(); // temperature in Fahrenheit or Celsius

        if(temp > 100)
            System.out.println("Fever");
        else
            System.out.println("Normal");
    }
}
