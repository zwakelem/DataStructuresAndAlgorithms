package za.co.simplitate.hashtable;

import za.co.simplitate.util.Employee;

public class StoredEmployee {

    public String key;
    public Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }
}
