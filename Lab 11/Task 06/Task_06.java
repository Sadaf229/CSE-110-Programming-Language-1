import java.util.Scanner;
public class Task_06{
    public static void main(String[]args){
        Scanner k= new Scanner (System.in);
        System.out.println("Enter what will be the length");
        int f=k.nextInt();
        int a[]=new int[f];
        System.out.println("Enter a number");
        a[0]=k.nextInt();
        for(int c=1;c<a.length;c+=1){
            System.out.println("Enter a number");
            a[c]=k.nextInt();
        }
        for(int c=0;c<a.length;c+=1){
            for(int i=0;i<a.length;i+=1){
                if(a[i]>a[c]){
                    int temp=a[i];
                    a[i]=a[c];
                    a[c]=temp;
                }
            }
        }
        if(a.length%2==0)
            System.out.print("The median is "+((double)((double)a[a.length/2]+(double)a[a.length/2-1])/2));
        else
            System.out.print("The median is "+a[a.length/2]);
            
    }
}
