package com.assignment.a5;
class HashMapNodeArr {
    int key;
    int value;
    HashMapNodeArr next;

    HashMapNodeArr(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class CustomHashMapArr {
    private HashMapNodeArr[] table;
    private int capacity;

    CustomHashMapArr(int capacity) {
        this.capacity = capacity;
        table = new HashMapNodeArr[capacity];
    }

    private int hash(int key) {
        return Math.abs(Integer.hashCode(key)) % capacity;
    }

    public void put(int key, int value) {
        int index = hash(key);
        HashMapNodeArr newNode = new HashMapNodeArr(key, value);

        if (table[index] == null) {
            table[index] = newNode;
        } else {
            HashMapNodeArr current = table[index];
            while (current != null) {
                if (current.key == key) {
                    current.value = value;
                    return;
                }
                if (current.next == null) {
                    current.next = newNode;
                    return;
                }
                current = current.next;
            }
        }
    }

    public int get(int key) {
        int index = hash(key);
        HashMapNodeArr current = table[index];

        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        return 0;  // Default value if key not found
    }

    public void increment(int key) {
        int index = hash(key);
        HashMapNodeArr current = table[index];

        while (current != null) {
            if (current.key == key) {
                current.value += 1;
                return;
            }
            current = current.next;
        }
        put(key, 1);  // Key not found, insert new node with value 1
    }

    public void printMap() {
        for (int i = 0; i < capacity; i++) {
            HashMapNodeArr current = table[i];
            while (current != null) {
                System.out.println(current.key + ": " + current.value);
                current = current.next;
            }
        }
    }
}

public class ModeOfArr {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 3, 4, 2, 3, 1, 1, 1};

        CustomHashMapArr countMap = new CustomHashMapArr(100);

        for (int num : array) {
            countMap.increment(num);
        }

        int mode = array[0];
        int maxCount = 0;

        for (int num : array) {
            int count = countMap.get(num);
            if (count > maxCount) {
                maxCount = count;
                mode = num;
            }
        }

        System.out.println("Mode of the array is: " + mode);
    }
}
