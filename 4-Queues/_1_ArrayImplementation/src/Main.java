public class Main {
    public static void main(String[] args) {

        Employee jane = new Employee("jane", "jones", 123);
        Employee john = new Employee("john", "doe", 4568);
        Employee mary =  new Employee("mary", "smith", 22);
        Employee nike =  new Employee("nike", "wilson", 3245);
        Employee bill =  new Employee("bill", "cash", 78);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(jane);
        queue.add(john);
        queue.add(mary);
        queue.add(nike);
        queue.add(bill);

        //queue.printQueue();

        queue.remove();
        queue.remove();

        //queue.printQueue();

        //System.out.println(queue.peek());


        queue.remove();
        queue.remove();
        queue.remove();
        //queue.remove(); //Exception in thread "main" java.util.NoSuchElementException

        queue.add(nike);
        queue.printQueue();


    }
}