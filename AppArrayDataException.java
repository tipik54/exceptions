package ru.kaznu.ruslan.exceptions;

public class AppArrayDataException extends RuntimeException { //создание своего исключения AppArraySizeException, на основе RuntimeException
    public AppArrayDataException(String message) {
        super(message);
    }
}
