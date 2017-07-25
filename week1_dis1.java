
public class week1_dis1{
    public static void main(String[] args){
        System.out.println(fib(10));
        
    }
    public static int fib(int N) { 
        if(N==1) return 0;
        else if(N==2) return 1;
        else return fib(N-1)+fib(N-2);
    }
    
}