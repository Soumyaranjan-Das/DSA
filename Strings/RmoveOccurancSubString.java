//Leetcode :-Remove All Occurances of a Substring
/*Given two strings s and part, 
perform the following operation on s until all occurrences of the substring part are removed:

Find the leftmost occurrence of the substring part and remove it from s.
Return s after removing all occurrences of part.

A substring is a contiguous sequence of characters in a string. */

class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part))
        {
            s=s.replaceFirst(part,"");
        }
        return s;
    }
}