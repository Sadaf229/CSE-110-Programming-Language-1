import java.util.Scanner;
public class Task_06{
    
    public static void main (String srgs []){
        System.out.println("Enter Quantity");
        Scanner input = new Scanner(System.in);
        int m=input.nextInt();
        int[] arr= new int[m]; 
        for (int i = 0; i < m; i++){
            arr[i]=input.nextInt();
        }
        for (int i = 0; i < m; i++){
            if(arr[i]%2==0)
                System.out.println("even");
            else 
                System.out.println("odd");
        }
        
    }
}