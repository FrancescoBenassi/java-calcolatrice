package org.lessons.java.utils;

public final class CalcoliHelper {
    private CalcoliHelper() {

    }

    // Utilizziamo l'Overloading per avere più metodi con un’implementazione
    // differente che condividono la medesima denominazione

    public final static int sumNumber(int number1, int number2) {
        return number1 + number2;
    }

    public final static double sumNumber(double number1, double number2) {
        return number1 + number2;
    }

    public final static int diffNumber(int number1, int number2) {
        return number1 - number2;
    }

    public final static double diffNumber(double number1, double number2) {
        return number1 - number2;
    }

    public final static int multiNumber(int number1, int number2) {
        return number1 * number2;
    }

    public final static double multiNumber(double number1, double number2) {
        return number1 * number2;
    }

    public final static int absNumber(int number) {
        return Math.abs(number);
        // if(number<0){
        // return number * -1;
        // }
        // return number;
    }

    public final static double absNumber(double number) {
        return Math.abs(number);
        // if(number<0){
        // return number * -1;
        // }
        // return number;
    }

    public final static int minNumber(int number1, int number2) {
        return Math.min(number1, number2);
        // if(number1 < number2){
        // return number1;
        // }
        // return number2;
    }

    public final static double minNumber(double number1, double number2) {
        return Math.min(number1, number2);
        // if(number1 < number2){
        // return number1;
        // }
        // return number2;
    }

    public final static int maxNumber(int number1, int number2) {
        return Math.max(number1, number2);
        // if(number1 > number2){
        //     return number1;
        // } 
        // return number2;
    }

    public final static double maxNumber(double number1, double number2) {
        return Math.max(number1, number2);
        // if(number1 > number2){
        //     return number1;
        // } 
        // return number2;
    }

    public static int powerNumber(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = base * result;
        }
        return result;
    }
}
