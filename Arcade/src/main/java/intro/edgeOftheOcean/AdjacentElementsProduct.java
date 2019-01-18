package intro.edgeOftheOcean;
/*
Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
Example:
For inputArray = [3, 6, -2, -5, 7, 3], the output should be
adjacentElementsProduct(inputArray) = 21.
7 and 3 produce the largest product.
*/
public class AdjacentElementsProduct {

    int adjacentElementsProduct(int[] inputArray) {
        int[] results = new int[inputArray.length - 1];
        for(int i = 0; i < inputArray.length - 1;i++){
            results[i] = inputArray[i] * inputArray[i+1];
        }
        int temp = results[0];
        for (int i = 1; i < results.length;i++){
            if(temp < results[i]){
                temp = results[i];
            }
        }
        return temp;
    }
}
