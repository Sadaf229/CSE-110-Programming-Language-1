import java.util.Scanner;
public class Task_07{
    
    public static void main (String srgs []){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Quantity");
        int q=input.nextInt();
        int a[]= new int[q];
        System.out.println("Enter Number");
        a[0]=input.nextInt();
        int avg = a[0], max=a[0], min=a[0];
        for(int i=1;i<q;i++){
            System.out.println("Enter Number");
            a[i]=input.nextInt();
            avg+=a[i];
            if(max<a[i]){
            max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
            System.out.println("max: "+max+" min: "+min+" avg: "+ avg/q);
        }
    }
}

