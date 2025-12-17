//Q19.Write a Java program to print an hour glass pattern.

import java.util.*;
public class Hourglass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i<=j)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                if(i+j<=n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j>n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                if(i>j)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        
    }
}