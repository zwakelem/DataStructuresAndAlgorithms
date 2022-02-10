package za.co.simplitate.hashtable;

import za.co.simplitate.util.Employee;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 456);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        ChainedHashedTable sht = new ChainedHashedTable();
        sht.put("Jones", janeJones);
        sht.put("Doe", johnDoe);
        sht.put("Wilson", mikeWilson);
        sht.put("Smith", marySmith);

        System.out.println("***********************");

        sht.printHashTable();
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
