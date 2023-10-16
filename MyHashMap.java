import java.util.LinkedList;

class MyHashMap {
    private static class Node {
        Object key;
        Object value;
        Node next;

        public Node(Object key, Object value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private static final int INITIAL_CAPACITY = 16;
    private LinkedList<Node>[] buckets;
    private int size;

    public MyHashMap() {
        buckets = new LinkedList[INITIAL_CAPACITY];
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
        size = 0;
    }

    private int getBucketIndex(Object key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode % INITIAL_CAPACITY);
    }

    public void put(Object key, Object value) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node> bucket = buckets[bucketIndex];
        for (Node node : bucket) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        Node newNode = new Node(key, value);
        bucket.add(newNode);
        size++;
    }

    public void remove(Object key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node> bucket = buckets[bucketIndex];
        Node prev = null;
        for (Node current : bucket) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    bucket.poll();
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
        }
    }

    public void clear() {
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            buckets[i].clear();
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(Object key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node> bucket = buckets[bucketIndex];
        for (Node node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null; // Key not found
    }
}

