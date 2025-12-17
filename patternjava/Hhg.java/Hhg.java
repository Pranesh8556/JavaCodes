//Q19.Write a Java program to print an hour glass pattern.

import java.util.*;
public class Hhg{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j||i==1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                if(i+j==n+1 || i==1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j==n+1 || i==n )
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                if(i==5 || i==j )
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        
    }
}