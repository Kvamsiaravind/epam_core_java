package ExceptionHandling;

import CustomExceptions.AgeLessThanZeroException;

public class CustomException {
    public static void main(String[] args) throws AgeLessThanZeroException {
        validate(-6);
    }

    private static void validate(int age) throws AgeLessThanZeroException {
        if (age < 0)
            throw new AgeLessThanZeroException("Age Could not be negative.");
    }
}

