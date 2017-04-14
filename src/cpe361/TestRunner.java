package cpe361;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/*
* Project: UnitTesting
* Created by Tommie on April 14, 2560 (14/4/2560).
*/

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestSuite.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
