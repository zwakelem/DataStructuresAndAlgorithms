package za.co.simplitate.hashtable;

import za.co.simplitate.util.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 456);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        Map<String, Employee> hashMap = new HashMap<>();
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Smith", marySmith);

        Employee employee = hashMap.putIfAbsent("Doe", mikeWilson);
        System.out.println(employee);

//        hashMap.forEach((k,v) -> System.out.println("Key=" + k + ", Employee=" + v));

        /* you dont get values in order they were inserted, order depends on hashing
        for a pre-determined order, use LinkedHashMap
        Iterator<Employee> iterator = hashMap.values().iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

       /* ChainedHashedTable sht = new ChainedHashedTable();
        sht.put("Jones", janeJones);
        sht.put("Doe", johnDoe);
        sht.put("Wilson", mikeWilson);
        sht.put("Smith", marySmith);

        System.out.println("***********************");

        sht.printHashTable();*/
//
//        System.out.println("Retrieve key Wilson: " + sht.get("Wilson"));
//        System.out.println("Retrieve key Smith: " + sht.get("Smith"));
//
//        System.out.println("***********************");
//
//        sht.remove("Wilson");
//        sht.remove("Smith");
//        sht.printHashTable();

    }
}
