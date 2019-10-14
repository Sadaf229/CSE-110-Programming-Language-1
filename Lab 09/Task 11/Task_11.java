public class Task_11{
    public static void main(String[]args){
        for(int n=40; n<=50;n++){
            int s= 0;
            for(int c=1;c<=n;c++){
                if(n%c==0)
                    s+=1;
            }
            if(s==2)
                System.out.println(n);
        }
    }
}