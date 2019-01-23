package intro.edgeOftheOcean;
/*
On the picture (shape.png) we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.

A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side. You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.
Example:
    For n = 2, the output should be
    shapeArea(n) = 5;
    For n = 3, the output should be
    shapeArea(n) = 13.
*/
public class ShapeArea {

    int shapeArea(int n) {
        int results = 0;
        if (n == 1)
            results = 1;
        else
            results = n*n + (n-1)*(n-1);
        return results;
    }
}
