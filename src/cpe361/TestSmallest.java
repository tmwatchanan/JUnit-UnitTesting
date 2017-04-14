package cpe361;

import org.junit.Test;

import static org.junit.Assert.*;

/*
* Project: UnitTesting
* Created by Tommie on April 14, 2560 (14/4/2560).
*/

public class TestSmallest {
    int smallestSide;

    @Test
    public void testSmallestOnAscendingOrder() throws Exception {
        int firstSide = smallestSide = 1;
        int secondSide = 2;
        int thirdSide = 3;
        assertEquals(smallestSide, Triangle.smallest(firstSide, secondSide, thirdSide));
    }

    @Test
    public void testSmallestOnDescendingOrder() throws Exception {
        int firstSide = 3;
        int secondSide = 2;
        int thirdSide = smallestSide = 1;
        assertEquals(smallestSide, Triangle.smallest(firstSide, secondSide, thirdSide));
    }

    @Test // Found a bug & fixed
    public void testSmallestOnSecondSideButFirstAndThirdSideAreEqual() throws Exception {
        int firstSide = 3;
        int secondSide = smallestSide = 1;
        int thirdSide = 3;
        assertEquals(smallestSide, Triangle.smallest(firstSide, secondSide, thirdSide));
    }

    @Test
    public void testSmallestOnSecondSideButFirstAndThirdSideAreNotEqual() throws Exception {
        int firstSide = 2;
        int secondSide = smallestSide = 1;
        int thirdSide = 3;
        assertEquals(smallestSide, Triangle.smallest(firstSide, secondSide, thirdSide));
    }
}