import java.util.Scanner;
public class Task_04{
    public static void main(String[]args){
        System.out.println("Input Row Number");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Input Column Number");
        int k = sc.nextInt();
        for(int c=1; c<=r; c+=1){
            for(int co=1; co<=k; co+=1){
                System.out.print(co);
            }
            System.out.println();
        }
    }
}