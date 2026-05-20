package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    private static final Logger logger =  LoggerFactory.getLogger(MathUtils.class);
    public int add(int a, int b) {
        int result = a + b;
        logger.info("Add: {} + {} = {}", a, b, result);
        return result;
    }
    public int sub(int a, int b) {
        int result = a - b;
        logger.info("Subtraction: {} - {} = {}", a, b, result);
        return result;
    }
    public int multiply(int a, int b) {
        int result = a * b;
        logger.info("Multipy: {} * {} = {}", a, b, result);
        return result;
    }
    public float divide(int a, int b) {
        if (b == 0) {
            logger.error("Cannot divide by Zero");
            throw new ArithmeticException("Divide by zero is not allowed");
        }
        float result = (float) a/b;
        logger.info("Divide: {} / {} = {}", a, b, result);
        return result;
    }
}
