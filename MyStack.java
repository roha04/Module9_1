public class MyStack {
    private Object[] array;
    private int size;

    public MyStack() {
        this.array = new Object[10]; // Default capacity of 10, you can change it as needed.
        this.size = 0;
    }

    public void push(Object value) {
        if (size == array.length) {
            // If the array is full, double its capacity
            int newCapacity = array.length * 2;
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size] = value;
        size++;
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = null; // Clear the last element
            size--;
        }
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        } else {
            return array[size - 1];
        }
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        } else {
            Object popped = array[size - 1];
            array[size - 1] = null;
            size--;
            return popped;
        }
    }

    private boolean isEmpty() {
        return size == 0;
    }
}

