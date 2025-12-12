//Q8.Java Program to find whether the last digit of given number is divisible by 3

import java.util.*;
public class Div {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        int last = a % 10;  // get last digit
        
        if(last % 3 == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
