

public class Fibonacci {
    public static void main(String[] args) {
         fib(10,0,1);
    }
    public static void fib(int n,int f1,int f2)
    {
       if(n==0)
       {
       return;
       }
       int f3=f1+f2;
       System.out.println(f1);
       f1=f2;
       f2=f3;
       fib(n-1,f1,f2);
    }
}
