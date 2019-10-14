import java.util.Scanner;
public class Task_17{
    public static void main(String[]args){
        Scanner k= new Scanner(System.in);
        System.out.println("Enter Row Number");
        int r= k.nextInt();
        for(int rc=1;rc<=r;rc+=1){
            if(rc==1){
            System.out.print(rc);
            }
            else if(rc==r){
                for(int c=1;c<=r;c+=1){
                    System.out.print(c);
                }
            }
            else{
                System.out.print("1");
                for(int sc=1;sc<rc-1;sc+=1){
                    System.out.print(" ");
                }
                System.out.print(rc);
            }
            System.out.println();
        }
    }
}