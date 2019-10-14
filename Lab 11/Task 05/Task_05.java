import java.util.Scanner;
public class Task_05{
    public static void main(String[]args){
        Scanner k= new Scanner (System.in);
        int a[]=new int[5];
        System.out.println("Enter a number");
        a[0]=k.nextInt();
        for(int c=1;c<a.length;c+=1){
            System.out.println("Enter a number");
            a[c]=k.nextInt();
        }
        for(int c=0;c<a.length;c+=1){
            for(int i=0;i<a.length;i+=1){
                if(a[i]<a[c]){
                    int temp=a[i];
                    a[i]=a[c];
                    a[c]=temp;
                }
            }
        }
        for(int c=0;c<a.length;c+=1){
            System.out.println(a[c]);
        }
    }
}