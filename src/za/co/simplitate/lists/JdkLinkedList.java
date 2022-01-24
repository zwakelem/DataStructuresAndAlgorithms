package za.co.simplitate.lists;

import za.co.simplitate.util.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class JdkLinkedList {

    public static void main(String[] args) {

        /**
         * memory intensive because it stores references to next and previous
         * faster when removing and adding at the head or tail of the list
         *
         */

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 456);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedList<Employee> list = new LinkedList<>();
        // addFirst() adds item to the front of the List
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        // add() and addLast() adds item to the end of the list
        list.addLast(billEnd);

        Iterator iter = list.iterator();
        System.out.print("HEAD -> ");
        while(iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");


        list.removeLast();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while(iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        // remove() and removeFirst() removes at the head of the list
        list.removeFirst();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while(iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");
    }
}
