import java.util.Scanner;
public class Task_04{
    public static void main(String[]args){
        Scanner k= new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<a.length;i+=1){
            System.out.println("Enter a number");
            a[i]= k.nextInt();
        }
        for(int n=0;n<=a.length-1;n+=1){
            if(a[n]%2==1){
                System.out.println(a[n]);
                break;
            }
        }
    }
}