public class Main {
    public static void main(String[] args) {
        Employee jane = new Employee("jane", "jones", 123);
        Employee john = new Employee("john", "doe", 4568);
        Employee mary =  new Employee("mary", "smith", 22);
        Employee nike =  new Employee("nike", "wilson", 3245);
        Employee bill =  new Employee("bill", "cash", 78);

        LinkedStack stack = new LinkedStack();
        stack.push(jane);
        stack.push(john);
        stack.push(mary);
        stack.push(nike);
        stack.push(bill);

        //print
        stack.printStack();

        //peek
        System.out.println("Peek");
        System.out.println(stack.peek());

        //pop
        System.out.println("Pop");
        System.out.println(stack.pop());

        //print
        System.out.println("After pop");
        stack.printStack();

    }
}