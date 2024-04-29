public class Main {
    public static void main(String[] args) {

        Employee jane = new Employee("jane", "jones", 123);
        Employee john = new Employee("john", "doe", 4568);
        Employee mary =  new Employee("mary", "smith", 22);
        Employee nike =  new Employee("nike", "wilson", 3245);
        Employee bill =  new Employee("bill", "cash", 78);

        ArrayQueue queue = new ArrayQueue(5);

          // Circular implementation
//        queue.add(jane);
//        queue.add(john);
//        queue.remove();
//        queue.add(mary);
//        queue.remove();
//        queue.add(nike);
//        queue.remove();
//        queue.add(bill);
//        queue.remove();
//        queue.add(jane);
//
//        queue.printQueue();


        //Non circular implementation
        queue.add(jane);
        queue.add(john);
        queue.add(mary);
        queue.add(nike);
        queue.add(bill);
        //queue.printQueue();

        queue.remove();
        queue.remove();
        //queue.printQueue();

        //Peek
        //System.out.println(queue.peek());

        //Removing all elements
        queue.remove();
        queue.remove();
        queue.remove();

        //Trigger the Exception
        //queue.remove();

        queue.add(nike);
       queue.printQueue();

    }
}