import java.util.Scanner;
public class Task_08{
    public static void main(String[]args){
        System.out.println("Enter Number");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt() , d=0;
        System.out.print("Divisors are: ");
        for(int c=1; c<=n;c++){
            if(n%c==0){
                d+=1;
                if(c==n){
                    System.out.print(c);
                }
                else{
                    System.out.print(c+",");
                }
            }
        }
        System.out.println();
        System.out.println("There are "+d+" divisors");
    }
}
