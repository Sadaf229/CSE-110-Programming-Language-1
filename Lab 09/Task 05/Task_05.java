import java.util.Scanner;
public class Task_05{

  public static void main (String srgs []){

 Scanner input = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            int num= input.nextInt();
            if(num%2==0)
                System.out.println("even");
            else 
                System.out.println("odd");
        }
  }
}