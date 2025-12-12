//Q9.Java Program to check odd or even using bitwise operator

import java.util.*;
public class Boe{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if((a & 1)==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
