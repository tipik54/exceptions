package ru.kaznu.ruslan.exceptions;

public class MainApp {
    public static void main(String[] args) {

        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        String[][] invalidDataArray = {
                {"1", "2", "three", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = ArrayProcessor.processArray(invalidDataArray);
            System.out.println("Сумма элементов массива: " + result);
        } catch (AppArrayDataException | AppArraySizeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}