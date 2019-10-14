import java.util.Scanner;
public class Task_24{
    public static void main(String[]args){
        Scanner d= new Scanner(System.in);
        System.out.println("Enter Number");
        int n= d.nextInt();
        for(int k=1;k<=n;k+=1){
            System.out.print(k);
        }
        n-=1;
        while(n>0){
            System.out.print(n);
            n-=1;
        }
        
    }
}