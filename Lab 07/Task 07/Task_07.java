import java.util.Scanner;
public class Task_07{
    public static void main(String[]args){
        System.out.println("Input Row Number");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int rc=1; rc<=r; rc+=1){
            for(int kc=r-rc;kc>0;kc-=1){
                System.out.print(" ");
            }
            for(int s=rc;s>0;s-=1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}