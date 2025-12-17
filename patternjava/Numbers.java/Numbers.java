import java.util.*;
public class Numbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int k=0;
            for(int j=1;j<=n;j++){
                if(i+j>=n+1)
                System.out.print(++k + " ");
                else
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                
                if(i>j)
                System.out.print(--k + " ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        
    }
}