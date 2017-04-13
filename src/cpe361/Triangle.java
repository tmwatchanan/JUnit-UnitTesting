package cpe361;

/**
 * Created by Tommie on 14/4/2560.
 */

import java.io.*;
public class Triangle {

    /* Declare side variables and set default values to 0 */
    protected static int firstSide = 0;
    protected static int secondSide = 0;
    protected static int thirdSide = 0;

    /* Determine which side is the largest */
    public static int largest(int side1, int side2, int side3) {
        if (((side1<=side2) && (side2<=side3)) || ((side2<=side1) || (side1<=side3)))
            return side3;
        else if (((side1<=side3) && (side3<=side2)) || ((side3<=side1) && (side1<=side2)))
            return side2;
        else
            return side1;
    }

    /* Determine which side is the middle side */
    public static int middle(int side1, int side2, int side3) {
        if (((side1<=side2) && (side2<=side3)) || ((side2<=side1) && (side3<=side2)))
            return side2;
        else if (((side1<=side3) && (side3<=side2)) || ((side3<=side1) && (side2<=side3)))
            return side3;
        else
            return side2;
    }

    /* Determine which side is the smallest */
    public static int smallest(int side1, int side2, int side3) {
        if (((side1<=side2) && (side2<=side3)) || ((side3<=side2) && (side1<=side3)))
            return side1;
        else if ( ((side2<=side3)&&(side3<=side1))||((side2<=side1)&&(side1<=side3)))
            return side1;
        else
            return side3;
    }

    public static String findTriangleType() {
        int shortSide = smallest(firstSide, secondSide, thirdSide);
        int middleSide = middle(firstSide, secondSide, thirdSide);
        int longSide = largest(firstSide, secondSide, thirdSide);

        if ( shortSide + middleSide < longSide )
            return new String("Not a Triangle");
        else if ((shortSide == middleSide) && (middleSide == longSide))
            return new String("Equilateral");
        else if ((shortSide == middleSide) || (middleSide == longSide))
            return new String("Isosceles");
        else
            return new String("Scalene");
    }

    public Triangle(int side1, int side2, int side3) {
        firstSide = side1;
        secondSide = side2;
        thirdSide = side3;
    }

}