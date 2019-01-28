package intro.exploringTheWaters;

import java.util.ArrayList;
import java.util.List;

/*
Given a rectangular matrix of characters, add a border of asterisks(*) to it.
Example:
For picture = ["abc",
           "ded"]
the output should be:
addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]

*/
public class AddBorder {
    String[] addBorder(String[] picture) {

        List<String> list = new ArrayList<String>();
        String s = "", s1 = "*";
        int elementLength = picture[0].length();

        for(int i = 0; i <= elementLength + 1; i++){
            s += "*";
        }
        list.add(s);
        for(int i = 0; i < picture.length; i++){
            s1 += picture[i];
            s1 += "*";
            list.add(s1);
            s1 = "*";
        }
        list.add(s);
        String[] stringArray = list.toArray(new String[0]);
        return stringArray;
    }

}
