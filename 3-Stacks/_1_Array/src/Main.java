public class Main {
    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee("jane", "jones", 123));
        stack.push(new Employee("john", "doe", 4568));
        stack.push(new Employee("mary", "smith", 22));
        stack.push(new Employee("nike", "wilson", 3245));
        stack.push(new Employee("bill", "cash", 78));


        //print stack
        stack.printStack();


        //peek
        System.out.println("Peek");
        System.out.println(stack.peek());


        //pop item
        System.out.println();
        System.out.println("Pooped: " + stack.pop());
    }
}