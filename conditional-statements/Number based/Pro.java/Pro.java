//Q19. Java Program to check whether the product of two numbers is positive or negative

import java.util.*;
public class Pro{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int pro=a*b;
        if(pro>=0)
        System.out.println("positive");
        else
        System.out.println("negative");
    }
}