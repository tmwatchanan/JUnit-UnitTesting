package cpe361;

import org.junit.Test;
import static org.junit.Assert.*;

/*
* Project: UnitTesting
* Created by Tommie on April 14, 2560 (14/4/2560).
*/

public class TestLargest {
    int largestSide;

    @Test
    public void TestLargestOnAscendingOrder() throws Exception {
        int firstSide = 1;
        int secondSide = 2;
        int thirdSide = largestSide = 3;
        assertEquals(largestSide, Triangle.largest(firstSide, secondSide, thirdSide));
    }
    @Test // Found a bug & fixed
    public void testLargestOnDescendingOrder() throws Exception {
        int firstSide = largestSide = 5;
        int secondSide = 4;
        int thirdSide = 3;
        assertEquals(largestSide, Triangle.largest(firstSide, secondSide, thirdSide));
    }
}