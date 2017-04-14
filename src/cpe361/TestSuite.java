package cpe361;

/*
* Project: UnitTesting
* Created by Tommie on April 14, 2560 (14/4/2560).
*/

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//JUnit Suite Test
@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestLargest.class,
        TestMiddle.class,
        TestSmallest.class,
        TestFindTriangleType.class
})

public class TestSuite {
}
