package ch.tbz;

public class IntStack {

    private int[] numbers = new int[9];
    private int index = -1;

    public void push(int number) {
        if (!isFull()) {
            numbers[++index] = number;
        }
    }

    public int pop() {
        if (isEmpty()) {
            return 0;
        }
        return numbers[index--];
    }

    public boolean isEmpty() {
        return index == -1;
    }

    public boolean isFull() {
        return index == numbers.length-1;
    }
}
