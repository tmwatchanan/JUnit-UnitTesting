package cpe361;

import org.junit.Test;

import static org.junit.Assert.*;

/*
* Project: UnitTesting
* Created by Tommie on April 14, 2560 (14/4/2560).
*/

public class TestMiddle {
    int middleSide;

    @Test
    public void testMiddleOnSecondSide() throws Exception {
        int firstSide = 4;
        int secondSide = middleSide = 5;
        int thirdSide = 6;
        assertEquals(middleSide, Triangle.middle(firstSide, secondSide, thirdSide));
    }

    @Test
    public void testMiddleOnThirdSide() throws Exception {
        int firstSide = 1;
        int secondSide = 5;
        int thirdSide = middleSide = 3;
        assertEquals(middleSide, Triangle.middle(firstSide, secondSide, thirdSide));
    }
}