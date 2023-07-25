package recursion;

public class SayDigit {
    public static void main(String[] args) {
        saydig(2346);
    }
    public static void saydig(int num)
    {
        if(num==0)
        {
            return;
        }
        String count[]={"zero","one","two","three","four","five","six","seven","eignt","nine"};

        saydig(num/10);
        System.out.print(count[num%10] +"\t");
    }

}
