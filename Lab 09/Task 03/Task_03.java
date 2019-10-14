public class Task_03{

  public static void main (String srgs []){

int s=0;
        for (int i = 0; i <= 600; i++) {
            if(i%7==0 && i%9==0){
                s=s+i;
            }
            else if(i%7==0){
              s=s+1;
            }
            else if(i%9==0){
              s=s+1;
            }
        }
        System.out.println("sum is: "+s);
        
  }
}