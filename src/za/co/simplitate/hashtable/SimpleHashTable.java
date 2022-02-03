package za.co.simplitate.hashtable;

import za.co.simplitate.util.Employee;

public class SimpleHashTable {

    private StoredEmployee[] hashtable;

    public SimpleHashTable() {
        hashtable = new StoredEmployee[10];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length - 1;
    }

    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if(occupied(hashedKey)) {
            // from here
            int stopIndex = hashedKey;
            if(hashedKey == hashtable.length -1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            // to here, sets value of 1st probe position
            while (occupied(hashedKey) && hashedKey != stopIndex) {
                // sets value of next probe position
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if(occupied(hashedKey))
            System.out.println("Already an employee at " + hashedKey);
        else
            hashtable[hashedKey] = new StoredEmployee(key, employee);
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stopIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        } else {
            return -1;
        }
    }

    public Employee get(String key) {
        int hashedKey = findKey(key);
        if(hashedKey == -1) {
            return null;
        }
        return hashtable[hashedKey].employee;
    }

    // TODO not working as it should
    public Employee remove(String key) {
        int hashedKey = findKey(key);
        if(hashedKey == -1) {
            return null;
        }
        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;
        return employee;
    }

    public void printHashtable() {
        for(int i = 0; i < hashtable.length; i++) {
            if(hashtable[i] == null) {
                System.out.println("empty");
            } else {
                System.out.println("Position " + i + ": " + hashtable[i].employee);
            }
        }
    }
}
