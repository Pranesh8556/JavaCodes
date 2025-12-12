//Discount program

import java.util.*;
public class Discount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int total_price=sc.nextInt();
        int disP=sc.nextInt();
        int discout=(total_price*disP)/100;
        int finall=total_price-discout;
        System.out.println(discout);
        System.out.println(finall);
        
        
    }
}