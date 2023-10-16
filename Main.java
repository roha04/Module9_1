import java.util.ArrayList;import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        //-------------ARRAY_LIST-------------------
        ArrayList<Object> arr = new ArrayList<>();
        MyArrayList<Object> arrayList = new MyArrayList<>();
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(3);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(8);
        System.out.println("Original array: "+arrayList.printArray());
        arrayList.remove(0);
        arrayList.remove(3);
        arrayList.remove(5);
        System.out.println("Array with removed elements: "+arrayList.printArray());
        System.out.println("Element by index: "+arrayList.get(8));
        System.out.println("Size: "+arrayList.getSize());
        arrayList.clear();
        System.out.println("Cleared array: "+arrayList.printArray());
        System.out.println("Size: "+arrayList.getSize());
        //-------------LINKED_LIST-------------------
        MyLinkedList<String>list = new MyLinkedList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(0);
        list.add(3);
        list.add(7);
        list.printNodes();
        System.out.println(list.size());
        list.remove(3);
        list.printNodes();
        list.remove(5);
        list.printNodes();
        list.remove(0);
        list.printNodes();
        //list.printNodes();
        //System.out.println(list.get(2));
        list.clear();
        list.printNodes();
        System.out.println(list.size());
        //list.printNodes();
        //System.out.println(list.size());
        //-------------QUEUE-------------------
        MyQueue queue = new MyQueue(5);

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Queue size: " + queue.size());

        System.out.println("Peek: " + queue.peek());
        //---------------STACK---------------------------
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack size: " + stack.size());

        System.out.println("Peek: " + stack.peek());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack size after pop: " + stack.size());
        //-------------HASHMAP----------------------
        MyHashMap myHashMap = new MyHashMap();

        myHashMap.put("name", "Rostyk");
        myHashMap.put("age", 20);
        myHashMap.put("city", "Lviv");

        System.out.println("Size: " + myHashMap.size());
        System.out.println("Name: " + myHashMap.get("name"));
        System.out.println("Age: " + myHashMap.get("age"));

        myHashMap.remove("age");

        System.out.println("Size after removal: " + myHashMap.size());

        myHashMap.clear();

        System.out.println("Size after clearing: " + myHashMap.size());


    }
}
