import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //default constructor gives 10 items without declaration
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("jane", "jones", 123));
        employeeList.add(new Employee("john", "doe", 4567));
        employeeList.add(new Employee("mary", "smith", 22));
        employeeList.add(new Employee("mike", "wilson", 3245));

        //get all
        employeeList.forEach(System.out::println);

        //get one
        System.out.println(employeeList.get(1));

        //check if list is empty
        System.out.println(employeeList.isEmpty());

        //set new employee
        employeeList.set(1, new Employee("Adam", "Steer", 2323));
        employeeList.forEach(System.out::println);

        System.out.println(employeeList.size());

        //adding new employee and shifting list items
        employeeList.add(3, new Employee("john", "doe", 4567));
        employeeList.forEach(System.out::println);


        //From List into Array
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        System.out.println("Employee array");
        for (Employee e: employeeArray){
            System.out.println(e);
        }

        //Equals method
        System.out.println();
        System.out.println("Contains: " + employeeList.contains(new Employee("mary", "smith", 22)));

        System.out.println();
        System.out.println("IndexOf: " + employeeList.indexOf(new Employee("john", "doe", 4567)));
        System.out.println();


        //remove item from list
        employeeList.remove(2);
        System.out.println("After removal");
        employeeList.forEach(System.out::println);

    }
}