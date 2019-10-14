import java.util.Scanner;
public class Task_01{
    public static void main(String[]args){
        Scanner k= new Scanner(System.in);
        int a[]=new int[3];
        for(int i=0;i<a.length;i+=1){
            System.out.println("Enter A number");
            a[i]= k.nextInt();
        }
        if(a[0]>a[1]){
            if(a[0]>a[2])
                System.out.println(a[0]);
            else
                System.out.println(a[2]);
        }
        else{
            if(a[1]>a[2])
                System.out.println(a[1]);
            else
                System.out.println(a[2]);
            }
    }
}