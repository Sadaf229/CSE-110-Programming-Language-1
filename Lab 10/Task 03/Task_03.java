import java.util.Scanner;
public class Task_03{
    public static void main(String[]args){
        Scanner k= new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<a.length;i+=1){
            System.out.println("Enter a number");
            a[i]= k.nextInt();
        }
        for(int n=a.length-1;n>=0;n-=1){
            System.out.println(a[n]);
        }
    }
}