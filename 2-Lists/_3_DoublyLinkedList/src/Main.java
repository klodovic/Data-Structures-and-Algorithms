public class Main {
    public static void main(String[] args) {

        Employee jane =  new Employee("jane", "jones", 123);
        Employee john =  new Employee("john", "doe", 4567);
        Employee mary = new Employee("mary", "smith", 22);
        Employee mike =  new Employee("mike", "wilson", 3245);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(jane);
        list.addToFront(john);
        list.addToFront(mary);
        list.addToFront(mike);

        list.printList();
        System.out.println();
        System.out.println("List size: " + list.getSize() + " elements...");

        //add at the end of the list
        Employee bill =  new Employee("bill", "strong", 56);
        list.addToEnd(bill);
        list.printList();
        System.out.println();
        System.out.println("List size: " + list.getSize() + " elements...");

        //remove from front
        list.removeFromFront();
        list.printList();
        System.out.println();
        System.out.println("List size: " + list.getSize() + " elements...");

        //remove from end
        list.removeFromEnd();
        System.out.println("Remove from end");
        list.printList();
        System.out.println();
        System.out.println("List size: " + list.getSize() + " elements...");
    }
}