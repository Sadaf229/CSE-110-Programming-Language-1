import java.util.Scanner;
public class Task_08{
    public static void main(String[]args){
        Scanner k= new Scanner (System.in);
        String s[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        System.out.println("Enter a number");
        int n=k.nextInt();
        System.out.print(s[n]);
    }
}