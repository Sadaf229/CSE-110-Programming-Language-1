import java.util.Scanner;
public class Task_01{
    public static void main(String[]args){
    System.out.println("Input Number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int c=1; c<=n; c+=1){
    System.out.print(c);
    }
    } 
}