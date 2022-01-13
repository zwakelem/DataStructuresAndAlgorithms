package za.co.simplitate.lists;

public class SinglyLinkedList {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 456);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList linkedList = new EmployeeLinkedList();
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
