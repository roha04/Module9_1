/*Напишіть свій клас MyArrayList як аналог класу ArrayList.
Можна використовувати 1 масив для зберігання даних.
Методи:
add(Object value) додає елемент в кінецьremove(int index) видаляє елемент із вказаним індексом
clear() очищає колекціюsize() повертає розмір колекції
get(int index) повертає елемент за індексом*/
public class MyArrayList <T>{
    private int size;
    private Object array[];
    private static final int INITIAL_CAPACITY=10;
    private int arraySize = INITIAL_CAPACITY;
    public MyArrayList() {
        array = new Object[INITIAL_CAPACITY];
    }
    public int getSize(){        return size;
    }    public void increaseCapacity(){
        int newCapacity = (int) (arraySize * (3.0 / 2) + 1);
        T[] newArray = (T[]) new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
        arraySize = newCapacity;
    }
    public void add(Object value){
        if (size >= arraySize) {
        increaseCapacity();
        }
        array[size] = value;
        size++;
    }
    public String printArray(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Object obj:array){
            stringBuilder.append(obj);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
    public void remove(int index){
        if (index < 0 || index >= size) {
        throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
    }
    public void clear(){
        size = 0;
        array = (T[]) new Object[arraySize];
        arraySize = INITIAL_CAPACITY;
    }
    public Object get(int index){
        if(index<0 || index>=size){
        throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }

}

