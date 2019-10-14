public class t1{
    public static void main (String [] args){
        for(int c=18;c<=63;c+=9){
            if(c==63){
            System.out.print(-c);
            }
            else{
                if(c%2==0){
                System.out.print(c+" ,");
                }
                else{
                System.out.print(c*-1+" ,");
                }
            }
        }
    }
}