
import java.util.ArrayList;
public class Substrings {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        solve(list,"abcd","",0);
        for (String s: list) {
            System.out.println(s);
        }
       
    }
    public static void solve(ArrayList<String> list,String str,String out,int i)
    {
        if(i==str.length())
        {
            list.add(out);
            return;
        }
       
        solve(list,str,out,i+1);
        solve(list,str,out+str.charAt(str.length()-i-1),i+1);
       
       
    }
}
