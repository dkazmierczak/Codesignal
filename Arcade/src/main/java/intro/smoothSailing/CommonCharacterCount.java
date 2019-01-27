package intro.smoothSailing;
/*
Given two strings, find the number of common characters between them.
Example:
For s1 = "aabcc" and s2 = "adcaa",
the output should be:
commonCharacterCount(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".
*/
public class CommonCharacterCount {
    int commonCharacterCount(String s1, String s2) {
        int count = 0;

        for (int i = 0; i < s1.length(); i++){
            if(s2.contains(String.valueOf(s1.charAt(i)))){
                count++;
                s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
            }
        }
        return count;
    }
}
