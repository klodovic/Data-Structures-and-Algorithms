public class Main {
    public static void main(String[] args) {

        Employee jane =  new Employee("jane", "jones", 123);
        Employee john =  new Employee("john", "doe", 4567);
        Employee mary = new Employee("mary", "smith", 22);
        Employee mike =  new Employee("mike", "wilson", 3245);

        //add to list
        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(jane);
        list.addToFront(john);
        list.addToFront(mary);
        list.addToFront(mike);

        //list size
        System.out.println("List size: " + list.getSize() + " elements...");

        //is list empty
        System.out.println("Is list empty? " + list.isEmpty());

        list.printList();

        //remove first element
        list.removeFromFront();
        System.out.println();
        System.out.println("List size: " + list.getSize() + " elements...");

    }
}