package ch.tbz;

public class CharacterStack {

    private char[] characters = new char[9];
    private int index = -1;

    public void push(char character) {
        if (!isFull()) {
            characters[++index] = character;
        }
    }

    public char pop() {
        if (isEmpty()) {
            return '\0';
        }
        return characters[index--];
    }

    public boolean isEmpty() {
        return index == -1;
    }

    public boolean isFull() {
        return index == characters.length-1;
    }
}
