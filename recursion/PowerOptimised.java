

public class PowerOptimised {
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
  public static long  power(int val,int n)
  {
    if(n==0)
    {
        return 1;
    }
    if(n%2==0)
    {
        return power(val,n/2)*power(val,n/2);
    }
    else{
        return val*power(val,n/2)*power(val,n/2);
    }
  }
}
