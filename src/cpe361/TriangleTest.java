package cpe361;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Tommie on 14/4/2560.
 */
public class TriangleTest {
    int firstSide = 1;
    int secondSide = 2;
    int thirdSide = 3;
    int largestSide = thirdSide;

    @Test
    public void largest() throws Exception {
        assertEquals(largestSide, Triangle.largest(firstSide, secondSide, thirdSide));
    }

}