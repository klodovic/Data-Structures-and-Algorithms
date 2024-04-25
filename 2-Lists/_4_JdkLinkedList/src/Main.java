import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Employee jane =  new Employee("jane", "jones", 123);
        Employee john =  new Employee("john", "doe", 4567);
        Employee mary = new Employee("mary", "smith", 22);
        Employee mike =  new Employee("mike", "wilson", 3245);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(jane);
        list.addFirst(john);
        list.addFirst(mary);
        list.addFirst(mike);


        //add item at the begging
        for (Employee employee: list){
            System.out.println(employee);
        }
        System.out.println();

        //add item at the end
        System.out.println("add item at the end");
        Employee bill =  new Employee("bill", "strong", 56);
        list.add(bill);
        for (Employee employee: list){
            System.out.println(employee);
        }

        //remove first
        System.out.println("Remove first");
        list.removeFirst();
        for (Employee employee: list){
            System.out.println(employee);
        }

        //remove last
        System.out.println("Remove last");
        list.removeLast();
        for (Employee employee: list){
            System.out.println(employee);
        }
    }
}