package intro.isalndOfKnowledge;
/*
Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.
Example:
For inputArray = [2, 4, 1, 0], the output should be
arrayMaximalAdjacentDifference(inputArray) = 3.
*/
public class ArrayMaximalAdjacentDifference {
    int arrayMaximalAdjacentDifference(int[] inputArray) {
        int tmp = 0;
        int tmp2 = 0;
        for (int i = 1; i < inputArray.length; i++){
            if(inputArray [i] - inputArray[i-1] > tmp){
                tmp = inputArray [i] - inputArray[i-1];
            }
        }
        for (int i = 0; i < inputArray.length - 1; i++){
            if(inputArray [i] - inputArray[i+1] > tmp2){
                tmp2 = inputArray [i] - inputArray[i+1];
            }
        }
        if(tmp > tmp2){
            return tmp;
        }
        else{
            return tmp2;
        }
    }
}
