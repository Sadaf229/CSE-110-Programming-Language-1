public class Task_04{
    
    public static void main(String[] args) {
        
        int sA=0;
        for (int i = 0; i <= 600; i++) {
            if(i%7==0 && i%9==0){
            }
            else if(i%7==0){
                sA=sA+i;
            }
            else if(i%9==0){
                sA=sA+i;
            }
        }
        System.out.println("sum is: "+sA);
    }
}