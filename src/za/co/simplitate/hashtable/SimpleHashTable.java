package za.co.simplitate.hashtable;

import za.co.simplitate.util.Employee;

public class SimpleHashTable {

    private Employee[] hashtable;

    public SimpleHashTable() {
        hashtable = new Employee[10];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] != null)
            System.out.println("Already an employee at " + hashedKey);
        else
            hashtable[hashedKey] = employee;
    }

    public Employee get(String key) {
        return hashtable[hashKey(key)];
    }

    public void printHashtable() {
        for(int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }
}
