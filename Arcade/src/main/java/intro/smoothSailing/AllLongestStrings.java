package intro.smoothSailing;
/*
Given an array of strings, return another array containing all of its longest strings.
Example:
For: inputArray = ["aba", "aa", "ad", "vcd", "aba"],
the output should be:
allLongestStrings(inputArray) = ["aba", "vcd", "aba"].
*/
import java.util.ArrayList;
public class AllLongestStrings {
    String[] allLongestStrings(String[] inputArray) {
        int maxLength = 0;
        ArrayList<String> array = new ArrayList<String>();

        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i].length() > maxLength){
                maxLength = inputArray[i].length();
            }
        }

        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i].length() == maxLength){
                array.add(inputArray[i]);
            }
        }
        String[] temp = array.toArray(new String[0]);

        return temp;
    }
}
