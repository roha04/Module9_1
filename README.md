# Module9_1
Завдання 1 - ArrayList
Напишіть свій клас MyArrayList як аналог класу ArrayList.

Можна використовувати 1 масив для зберігання даних.

Методи

add(Object value) додає елемент в кінець
remove(int index) видаляє елемент із вказаним індексом
clear() очищає колекцію
size() повертає розмір колекції
get(int index) повертає елемент за індексом
Завдання 2 - LinkedList
Напишіть свій клас MyLinkedList як аналог класу LinkedList.

Не можна використовувати масив. Кожний елемент повинен бути окремим об'єктом-посередником (Node - нода), що зберігає посилання на попередній та наступний елемент колекції (двозв'язний список).

Методи

add(Object value) додає елемент в кінець
remove(int index) видаляє елемент із вказаним індексом
clear() очищає колекцію
size() повертає розмір колекції
get(int index) повертає елемент за індексом
Завдання 3 - Queue
Написати свій клас MyQueue як аналог класу Queue, який буде працювати за принципом FIFO (first-in-first-out).

Можна робити за допомогою Node або використати масив.

Методи

add(Object value) додає елемент в кінець
clear() очищає колекцію
size() повертає розмір колекції
peek() повертає перший елемент з черги
poll() повертає перший елемент з черги і видаляє його з колекції
Завдання 4 - Stack
Написати свій клас MyStack як аналог класу Stack, який працює за принципом LIFO (last-in-first-out).

Можна робити за допомогою Node або використати масив.

Методи

push(Object value) додає елемент в кінець
remove(int index) видаляє елемент за індексом
clear() очищає колекцію
size() повертає розмір колекції
peek() повертає перший елемент стеку
pop() повертає перший елемент стеку та видаляє його з колекції
Завдання 5 - HashMap
Написати свій клас MyHashMap як аналог класу HashMap.

Потрібно робити за допомогою однозв'язної Node.

Не може зберігати дві ноди з однаковими ключами.

Методи

put(Object key, Object value) додає пару ключ + значення
remove(Object key) видаляє пару за ключем
clear() очищає колекцію
size() повертає розмір колекції
get(Object key) повертає значення (Object value) за ключем
