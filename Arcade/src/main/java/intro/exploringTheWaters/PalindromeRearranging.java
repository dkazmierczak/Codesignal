package intro.exploringTheWaters;
/*
Given a string, find out if its characters can be rearranged to form a palindrome.
Example:
For inputString = "aabb",
the output should be:
palindromeRearranging(inputString) = true.
We can rearrange "aabb" to make "abba", which is a palindrome.
*/
public class PalindromeRearranging {
    boolean palindromeRearranging(String inputString) {
        int []tab = new int[26];
        for(int i=0; i<inputString.length(); i++)
            tab[inputString.charAt(i)-97]++;
        int count=0;
        for(int i=0; i<tab.length; i++)
            if(tab[i]%2!=0)
                count++;
        return count<=1;
    }
}
