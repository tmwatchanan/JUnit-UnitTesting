package cpe361;

import org.junit.Test;

import static org.junit.Assert.*;

/*
* Project: UnitTesting
* Created by Tommie on April 14, 2560 (14/4/2560).
*/

public class TestFindTriangleType {
    String expectedOutput;
    int firstSide;
    int secondSide;
    int thirdSide;

    @Test
    public void testNotATriangle1() throws Exception {
        expectedOutput = "Not a Triangle";
        firstSide = 2;
        secondSide = 2;
        thirdSide = 4;
        Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
        assertEquals(expectedOutput, triangle.findTriangleType());
    }

    @Test // Found a bug & fixed
    public void testNotATriangleWithAllZeros() throws Exception {
        expectedOutput = "Not a Triangle";
        firstSide = 0;
        secondSide = 0;
        thirdSide = 0;
        Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
        assertEquals(expectedOutput, triangle.findTriangleType());
    }

    @Test
    public void testNotATriangleWithAllNegative() throws Exception {
        expectedOutput = "Not a Triangle";
        firstSide = -1;
        secondSide = -1;
        thirdSide = -1;
        Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
        assertEquals(expectedOutput, triangle.findTriangleType());
    }

    @Test
    public void testEquilateral() throws Exception {
        expectedOutput = "Equilateral";
        firstSide = 5;
        secondSide = 5;
        thirdSide = 5;
        Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
        assertEquals(expectedOutput, triangle.findTriangleType());
    }

    @Test
    public void testIsosceles1() throws Exception {
        expectedOutput = "Isosceles";
        firstSide = 4;
        secondSide = 4;
        thirdSide = 2;
        Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
        assertEquals(expectedOutput, triangle.findTriangleType());
    }

    @Test
    public void testIsosceles2() throws Exception {
        expectedOutput = "Isosceles";
        firstSide = 10;
        secondSide = 8;
        thirdSide = 8;
        Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
        assertEquals(expectedOutput, triangle.findTriangleType());
    }

    @Test
    public void testIsosceles3() throws Exception {
        expectedOutput = "Isosceles";
        firstSide = 10;
        secondSide = 10;
        thirdSide = 1;
        Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
        assertEquals(expectedOutput, triangle.findTriangleType());
    }

    @Test
    public void testScalene1() throws Exception {
        expectedOutput = "Scalene";
        firstSide = 2;
        secondSide = 4;
        thirdSide = 3;
        Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
        assertEquals(expectedOutput, triangle.findTriangleType());
    }

    @Test
    public void testScalene2() throws Exception {
        expectedOutput = "Scalene";
        firstSide = 4;
        secondSide = 2;
        thirdSide = 3;
        Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
        assertEquals(expectedOutput, triangle.findTriangleType());
    }
}