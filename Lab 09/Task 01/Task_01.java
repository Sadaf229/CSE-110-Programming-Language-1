public class Task_01 {
    
    public static void main(String[] args) {
        
        System.out.print("a. ");
        for(int s=24;s>=-6;s=s-6){
            if(s!=-6){
                System.out.print(s+", ");
            }
            else{
                System.out.print(s);
            }
        }
        System.out.println();
        System.out.print("b. ");
        for(int s=-10;s<=20;s=s+5){
            if(s!=20){
                System.out.print(s+", ");
            }
            else{
                System.out.print(s);
            }
            
        }
        System.out.println();
        System.out.print("c. ");
        for(int s=18;s<=63;s=s+9){
            if(s!=63){
                System.out.print(s+", ");
            }
            else{
                System.out.print(s);
            }
            
        }
        System.out.println();
        System.out.print("d. ");
        for(int s=18;s<=63;s=s+9){
            if(s==63){
                System.out.print(-s);
            }
            else{
                if(s%2==0){
                    System.out.print(s+", ");
                }
                else{
                    System.out.print(s*-1+", ");
                }
            }
        }
    }
}