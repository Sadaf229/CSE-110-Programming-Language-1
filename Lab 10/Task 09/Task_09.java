import java.util.Scanner;
public class Task_09{
    public static void main(String[]args){
        Scanner k= new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<a.length;i+=1){
            System.out.println("Enter a number");
            a[i]= k.nextInt();
        }
        System.out.println("Enter a number you want to check");
        int c = k.nextInt();
        for(int n=a.length-1;n>=0;n-=1){
            if(a[n]==c){
                System.out.println("Yes");
                break;
            }
            else if(n==0){
                System.out.println("No");
            
            }
        }
    }
}