import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Employee jane = new Employee("jane", "jones", 123);
        Employee john = new Employee("john", "doe", 4568);
        Employee mary =  new Employee("mary", "smith", 22);
        Employee nike =  new Employee("nike", "wilson", 3245);
        //Employee bill =  new Employee("bill", "cash", 78);

        Map<String, Employee> hashMap = new HashMap<String, Employee>();

        hashMap.put("jones", jane);
        hashMap.put("doe", john);
        hashMap.put("smith", mary);


        hashMap.forEach((k, v) -> System.out.println("Key = " + k + ", Employee = " + v));


        System.out.println(hashMap.getOrDefault("smith", nike)); //stopping return of null


        System.out.println(hashMap.remove("jones"));
        hashMap.forEach((k, v) -> System.out.println("Key = " + k + ", Employee = " + v));

    }
}