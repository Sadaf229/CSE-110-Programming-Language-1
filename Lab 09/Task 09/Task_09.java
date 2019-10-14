import java.util.Scanner;
public class Task_09{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt(), s= 0;
        for(int c=1; c<n;c++){
        if(n%c==0)
        s+=c;
        }
        if(s==n)
            System.out.println("The number is perfect");
        else{
        System.out.println("The number is not perfect");
        }
    }
}