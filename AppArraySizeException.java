package ru.kaznu.ruslan.exceptions;

public class AppArraySizeException extends RuntimeException { //создание своего исключения AppArraySizeException, на основе RuntimeException
    public AppArraySizeException(String message) {
        super(message);
    }
}
