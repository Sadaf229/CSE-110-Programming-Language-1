import java.util.Scanner;
public class Task_19{
    public static void main(String[]args){
        Scanner k= new Scanner(System.in);
        System.out.println("Enter Row Number");
        int r= k.nextInt();
        for(int rc=r;rc>0;rc-=1){
            if(rc==1){
                for(int l=1;l<=r;l+=1){
                    System.out.print(l);
                }
            }
            else{
                for(int sc=0; sc<rc-1;sc+=1){
                    System.out.print(" ");
                }
                System.out.print(rc);
                if(rc==r-1)
                System.out.print(r);
                for(int g=1;g<r-rc;g+=1){
                    System.out.print(" ");
                    if(g==r-rc-1)
                        System.out.print(r);
                }
                System.out.println();
            }
        }
    }
}
