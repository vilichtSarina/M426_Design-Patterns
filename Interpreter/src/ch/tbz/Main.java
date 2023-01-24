package ch.tbz;
// This project was created with the following article cited as a source:
// https://sourcemaking.com/design_patterns/interpreter/java/2

public class Main {
    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter();

        String initialInput = "(3-(4*(5+6))/(7-8))*9/4";
        String reversePolishNotation = interpreter.convertToReversePolishNotation(initialInput);
        int result = interpreter.calculateResult(reversePolishNotation);

        System.out.println(initialInput);
        System.out.println(reversePolishNotation);
        System.out.println(result);
    }
}