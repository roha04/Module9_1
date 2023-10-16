import java.util.List;
import java.util.Objects;

/*Завдання 2 - LinkedList
Напишіть свій клас MyLinkedList як аналог класу LinkedList.
Не можна використовувати масив.
Кожний елемент повинен бути окремим об'єктом-посередником (Node - нода),
що зберігає посилання на попередній та наступний елемент колекції (двозв'язний список).
Методи
++++++++add(Object value) додає елемент в кінець
++++++++remove(int index) видаляє елемент із вказаним індексом
clear() очищає колекцію
++++++++size() повертає розмір колекції
++++++++get(int index) повертає елемент за індексом */
public class MyLinkedList<T> {
    static class Node{
        Object value;
        Node prev;
        Node next;
        public Node(Object value){
            this.value=value;
        }
    }
    private Node head = null;
    private Node tail = null;
    public void add(Object value){
        Node new_Node = new Node(value);
        if(head==null){
            head=tail=new_Node;
            head.prev=null;
            tail.next=null;
        }
        else{
            tail.next=new_Node;
            new_Node.prev=tail;
            tail=new_Node;
            tail.next=null;
        }
    }
    public int size(){
        int count =0;
        Node current =head;
        while(current!=null){
            current = current.next;
            count++;
        }
        return count;

    }
    public void printNodes(){
        Node current = head;
        System.out.print("Nodes of doubly linked list: ");
        while(current != null) {
            System.out.print(current.value + " ");
            current = current.next;

        }
        System.out.println();
    }
    public Node delete(Node del){
        if (head == null || del == null){
            return null;
        }
        if (head == del) {
            head = del.next;
        }
        if (del.next != null) {
            del.next.prev = del.prev;
        }
        if (del.prev != null) {
            del.prev.next = del.next;
        }
        del = null;

        return head;
    }
    public void remove(int index){
        Node current =head;
        int i;
        for (i = 0; current != null && i < index; i++)
        {
            current = current.next;
        }
        if (current == null)
            return;

        delete(current);
    }
    public Object get(int index){
        Node current=head;
        int i;
        for(i=0;current!=null && i<index;i++){
            current=current.next;
        }
        return current.value;
    }
    public void clear(){
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.value = null;
            current.next = null;
            current.prev = null;
            current = next;
        }
        head = null;
        tail = null;
    }
}
