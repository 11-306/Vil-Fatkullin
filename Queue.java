import java.util.NoSuchElementException;

public class Queue {
    private int rightBorder;
    private int leftBorder;
    private int size;
    private int[] array;

    Queue(int SIZE) {
        array = new int[SIZE];
        rightBorder = 0;
        leftBorder = 0;
        size = 0;
    }

    void push(int x) {
        if (size == array.length + 1) {
            throw new IllegalArgumentException("error");
        }

        array[rightBorder] = x;
        rightBorder = (rightBorder + 1) % array.length;
        size++;

    }

    int pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Error");
        } else {
            size--;
            return array[leftBorder++];
        }
    }

    int front() {
        if (isEmpty()) {
            throw new NoSuchElementException("Error");
        } else {
            return array[leftBorder];
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Очередь пуста");
        } else {
            int current = leftBorder;
            System.out.print("Очередь: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[current] + " ");
                current = (current + 1) % array.length;
            }
            System.out.println();
        }
    }


    int size() {
        return (size);
    }

    void clear() {
        leftBorder = 0;
        rightBorder = 0;
        size = 0;
    }

    boolean isEmpty() {
        if (leftBorder == rightBorder) {
            return true;
        } else {
            return false;
        }
    }
}

