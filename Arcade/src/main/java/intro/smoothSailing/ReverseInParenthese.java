package intro.smoothSailing;
/*
Write a function that reverses characters in (possibly nested) parentheses in the input string.
Input strings will always be well-formed with matching ()s.
Example:
    For inputString = "(bar)", the output should be
    reverseInParentheses(inputString) = "rab";
    For inputString = "foo(bar)baz", the output should be
    reverseInParentheses(inputString) = "foorabbaz";
    For inputString = "foo(bar)baz(blim)", the output should be
    reverseInParentheses(inputString) = "foorabbazmilb";
    For inputString = "foo(bar(baz))blim", the output should be
    reverseInParentheses(inputString) = "foobazrabblim".
    Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
*/

public class ReverseInParenthese {
    String reverseInParentheses(String inputString) {
        StringBuilder str = new StringBuilder(inputString);
        int start, end;
        while(str.indexOf("(") != -1){
            start = str.lastIndexOf("(");
            end = str.indexOf(")", start);
            str.replace(start, end + 1, new StringBuilder(str.substring(start+1, end)).reverse().toString());
        }
        return str.toString();
    }
}
