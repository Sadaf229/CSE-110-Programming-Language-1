import java.util.Scanner;
public class Task_11{
    public static void main(String[]args){
        Scanner k= new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter a number");
        a[0]= k.nextInt();
        for(int i=1;i<a.length;i+=1){
            System.out.println("Enter a number");
            a[i]= k.nextInt();
            for(int f=0;f<i;f+=1){
                if(a[i]==a[f]){
                    i-=1;
                    System.out.println("Error, Duplicate number detected.");
                    break;
                }
            }
        }
    }
}