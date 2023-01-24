package ch.tbz;

public class Interpreter {

    private final String operations = "+-*/()";

    //Definition of grammar based on operator precesence
    private boolean hasPrecedence(char a, char b) {
        String highPrecedence = "*/";
        String lowPrecedence = "+-";

        if (a == '(') {
            return false;
        }
        if (a == ')' && b == '(') {
            return false;
        }
        if (b == '(') {
            return false;
        }
        if (b == ')') {
            return true;
        }
        if (highPrecedence.indexOf(a) > -1 && lowPrecedence.indexOf(b) > -1) {
            return true;
        }
        return highPrecedence.indexOf(a) > -1 && highPrecedence.indexOf(b) > -1;
    }

    public String convertToReversePolishNotation(String input) {
        CharacterStack operationsStack = new CharacterStack();
        StringBuilder output = new StringBuilder();

        char topSymbol = '+';
        boolean empty;

        for (int i = 0; i < input.length(); i++) {
            if (operations.indexOf(input.charAt(i)) == -1)
                output.append(input.charAt(i));
            else {
                while (!(empty = operationsStack.isEmpty())
                        && hasPrecedence(topSymbol = operationsStack.pop(), input.charAt(i)))
                    output.append(topSymbol);
                if (!empty) {
                    operationsStack.push(topSymbol);
                }
                if (empty || input.charAt(i) != ')') {
                    operationsStack.push(input.charAt(i));
                } else topSymbol = operationsStack.pop();
            }
        }
        while (!operationsStack.isEmpty()) {
            output.append(operationsStack.pop());
        }
        return output.toString();
    }

    public int calculateResult(String input) {
        IntStack intStack = new IntStack();

        int a = 0;
        int b = 0;

        for (int i = 0; i < input.length(); i++) {
            if (operations.indexOf(input.charAt(i)) == -1) {
                intStack.push(input.charAt(i) - 48);
            } else {
                b = intStack.pop();
                a = intStack.pop();
                if (input.charAt(i) == '+') {
                    a = a + b;
                }
                if (input.charAt(i) == '-') {
                    a = a - b;
                }
                if (input.charAt(i) == '*') {
                    a = a * b;
                }
                if (input.charAt(i) == '/') {
                    a = a / b;
                }
                intStack.push(a);
            }
        }
        return intStack.pop();
    }

}
