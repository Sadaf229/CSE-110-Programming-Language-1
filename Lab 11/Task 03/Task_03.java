import java.util.Scanner;
public class Task_03{
    public static void main(String[]args){
    Scanner k= new Scanner (System.in);
    int a[]=new int[5];
    System.out.println("Enter a number");
    a[0]=k.nextInt();
    int max = a[0];
    int maxL=0;
    int min=a[0];
    int minL=0;
    for(int c=1;c<a.length;c+=1){
    System.out.println("Enter a number");
    a[c]=k.nextInt();
    }
    for(int c=0;c<a.length;c+=1){
        for(int i=0;i<a.length;i+=1){
            if(a[i]>a[c]){
                max=a[i];
                maxL=i;
            }
            if(a[i]<a[c]){
                min=a[i];
                minL=i;
            }
        }
    }
    System.out.println("Smallest number "+min+" was found at location "+minL);
    System.out.println("Largest number "+max+" was found at location "+maxL);
    }
}