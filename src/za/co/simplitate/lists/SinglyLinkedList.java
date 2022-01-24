package za.co.simplitate.lists;

import za.co.simplitate.util.Employee;

public class SinglyLinkedList {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 456);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeSinglyLinkedList linkedList = new EmployeeSinglyLinkedList();
        linkedList.addToFront(janeJones);
        linkedList.addToFront(johnDoe);
        linkedList.addToFront(marySmith);
        linkedList.addToFront(mikeWilson);

        System.out.println(linkedList.getSize());

        linkedList.printList();

        linkedList.removeFromFront();
        System.out.println(linkedList.getSize());
        linkedList.printList();

    }
}
