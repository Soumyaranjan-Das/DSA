
//this class has a print function which prints 1,2,3,....,n using recursion
public class WholenoSereis {
    public static void main(String[] args) {
        System.out.println("Series is \n");
        print(5);
    }
    public static void print(int n)
    {
        if(n==0)
        {
            return;
        }
        print(n-1);
        System.out.print(n+"\t");
       // print(n-1);
    }
}
