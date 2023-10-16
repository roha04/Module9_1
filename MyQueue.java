import java.lang.reflect.Array;
/*Завдання 3 - Queue
Написати свій клас MyQueue як аналог класу Queue, який буде працювати за принципом FIFO (first-in-first-out).
Можна робити за допомогою Node або використати масив.
Методи:
+++++++add(Object value) додає елемент в кінець
clear() очищає колекцію
size() повертає розмір колекції
peek() повертає перший елемент з черги
poll() повертає перший елемент з черги і видаляє його з колекції*/
public class MyQueue {
    private Object[] array;
    private int size;
    private int front;
    private int rear;

    public MyQueue(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    public void add(Object value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add more items.");
        } else {
            rear = (rear + 1) % array.length;
            array[rear] = value;
            size++;
        }
    }

    public void clear() {
        array = new Object[array.length];
        size = 0;
        front = 0;
        rear = -1;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        } else {
            return array[front];
        }
    }

    public Object poll() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        } else {
            Object removed = array[front];
            array[front] = null; // Remove the reference to the item for garbage collection
            front = (front + 1) % array.length;
            size--;
            return removed;
        }
    }

    private boolean isFull() {
        return size == array.length;
    }

    private boolean isEmpty() {
        return size == 0;
    }
}
