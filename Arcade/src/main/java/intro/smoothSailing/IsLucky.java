package intro.smoothSailing;
/*
Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
Given a ticket number n, determine if it's lucky or not.
Example:
    For n = 1230, the output should be
    isLucky(n) = true;
    For n = 239017, the output should be
    isLucky(n) = false.

*/
public class IsLucky {
    boolean isLucky(int n) {
        boolean check = true;
        char[] digits = String.valueOf(n).toCharArray();
        int half = digits.length/2;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < half; i++){
            sum1 += digits[i];
        }
        for(int i = half; i < digits.length; i++){
            sum2 += digits[i];
        }
        if(sum1 == sum2){
            check = true;
        }else{
            check = false;
        }
        return check;
    }

}
