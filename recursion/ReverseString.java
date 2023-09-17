public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("abcdef",0));
    }
    public static String reverse(String str,int i)
    {
        if(i==str.length())
        {
            return "";
        }
        return reverse(str, i+1)+str.charAt(i);
    }
}
