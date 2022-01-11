package za.co.simplitate.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    /*
     * ArrayList is backed by array
     * initial size is 10 if unspecified
     * capacity is the backing array size, size is number of items in list
     * list.toArray() gives you the backing array
     * is not synchronized, unlike Vector, that is ArrayList is not thread safe
     */

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 456));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        employeeList.forEach(System.out::println);
    }
}
