//Q19.Write a Java program to display mobile data usage alert – "Low Data", "Half Javaonsumed", or "Data Over" based on usage.

import java.util.*;
public class DataUsage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int totalData = sc.nextInt();  
        int usedData = sc.nextInt();   

        double usedPercent = (usedData * 100.0) / totalData;

        if(usedPercent <= 25)
            System.out.println("Low Data");
        else if(usedPercent <= 50)
            System.out.println("Half Consumed");
        else
            System.out.println("Data Over");
    }
}
