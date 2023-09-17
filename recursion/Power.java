

public class Power {
    public static void main(String[] args) {
        System.out.println("2^n= "+power(10));
    }
    public static int power(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return 2*power(n-1);
    }
}
