package cpe361;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by Tommie on 14/4/2560.
 */
public class TriangleRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TriangleTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
