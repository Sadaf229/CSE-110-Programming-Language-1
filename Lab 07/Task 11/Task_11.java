import java.util.Scanner;
public class Task_11{
    public static void main(String[]args){
        System.out.println("Input Row Number");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int rc=1; rc<=r; rc+=1){
            for(int kc=0; kc<r-rc; kc+=1){
                System.out.print(" ");
                }
            for(int cc=r; cc>r-rc;cc-=1){
                int k =0;
                System.out.print(cc-k);
                k+=1;
            }
            System.out.println();
        }
    }
}