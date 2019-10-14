public class Task_02{

  public static void main (String srgs []){
  
  int sum=0;
        for (int i = 0; i <= 600; i++) {
            if(i%7==0 && i%9==0)
            {
                sum=sum+i;
            }
        }
  System.out.println(sum);
  
  }


}