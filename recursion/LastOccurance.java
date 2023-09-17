public class LastOccurance {
    public static void main(String[] args) {
        String str="aabcbbbbdag";
        System.out.println(lastOccurance(str,'a',str.length()-1));
    }
    public static int lastOccurance(String str,char ch,int i)
    {
        if(i<0)
        {
            return -1;
        }
        if(str.charAt(i)==ch)
        {
            return i;
        }
       
       return lastOccurance(str, ch, i-1);
       
    }
}
