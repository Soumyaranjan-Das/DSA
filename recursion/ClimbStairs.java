class ClimbStairs
{
    public static void main(String[] args) {
        System.out.println(climb(6));
    }
    public static int climb(int n)
    {
        if(n==2)
        {
            return 2;
        }
        if(n==1)
        {
            return 1;
        }
        return climb(n-1)+climb(n-2);

    }
}