public class PallindromeRE {
    public static void main(String[] args) {
        System.out.println(isPallindrome("abcdcba",0));
    }
    public static boolean isPallindrome(String str,int i)
    {
        if(i>str.length()/2)
        {
            return true;
        }
        if(str.charAt(i)!=str.charAt(str.length()-1-i))
        {
            return false;
        }
        return isPallindrome(str, i+1);
    }
}
