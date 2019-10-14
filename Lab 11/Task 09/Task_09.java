import java.util.Scanner;
public class Task_09{
    public static void main(String[]args){
        Scanner k= new Scanner (System.in);
        int a[]=new int[15];
        System.out.println("Enter a number");
        a[0]=k.nextInt();
        int j[]= new int [10];
        for(int c=1;c<a.length;c+=1){
            System.out.println("Enter a number");
            int n = k.nextInt();
            a[c]= n;
            j[n]+=1;
        }
        for(int l=0;l<j.length;l+=1){
            System.out.print("The number " +l+ " is entered "+j[l]+ " times");
            System.out.println();
        }
    }
}