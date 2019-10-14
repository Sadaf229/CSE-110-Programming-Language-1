import java.util.Scanner;
public class Task_13{
    public static void main(String[]args){
    Scanner k= new Scanner(System.in);
    System.out.println("Enter Row Number");
    int r = k.nextInt();
    for(int rc=1;rc<=r;rc++){
        for(int sc=r-rc; sc>0; sc-=1){
        System.out.print(" ");
        }
        for(int c=1;c<=rc*2-1;c+=1){
        System.out.print(c);
        }
        System.out.println();
    }
    for(int rca=r-1; rca>0;rca--){
        for(int sca=r-rca; sca>0; sca-=1){
        System.out.print(" ");
        }
        for(int ca=1;ca<=2*rca-1;ca+=1){
        System.out.print(ca);
        }
        System.out.println();
    }
    }
}