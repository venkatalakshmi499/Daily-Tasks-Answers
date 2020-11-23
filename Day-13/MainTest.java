package com.src;

import org.junit.runner.notification.*;
import org.junit.runner.*;
import java.util.*;

public class MainTest
{
    public static void main(final String[] args) {
        final Result result = JUnitCore.runClasses(new Class[] { AllTests.class });
        for (final Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}