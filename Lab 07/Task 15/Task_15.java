import java.util.Scanner;
public class Task_15{
    public static void main(String[]args){
        Scanner k= new Scanner(System.in);
        System.out.println("Enter Row Number");
        int r= k.nextInt();
        System.out.println("Enter Column Number");
        int c= k.nextInt();
        for(int rc=1; rc<=r;rc+=1){
            if(rc==1){
                for(int cc=1;cc<=c;cc+=1){
                    System.out.print(cc);
                }
            }
            else if(rc==r){
                for(int cc=1;cc<=c;cc+=1){
                    System.out.print(cc);
                }
            }
            else{
                System.out.print("1");
                for(int sc=1;sc<c-1;sc+=1){
                    System.out.print(" ");
                }                
                System.out.print(c);
            }
            System.out.println();
        }
    }
}