package recursion;

public class StringPallindrom {
 public static void main(String[] args) {
    System.out.println(ispallindrome("aacbaa",0));
 }   
 public static boolean ispallindrome(String str,int i)
 {
    if(i<str.length()/2)
    {
        if(str.charAt(i)!=str.charAt(str.length()-i-1))
        {
            return false;
        }
        else{
            return ispallindrome(str, i+1);
        }
    }
    return true;
 }
}
