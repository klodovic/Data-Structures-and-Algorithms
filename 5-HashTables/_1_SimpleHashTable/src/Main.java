public class Main {
    public static void main(String[] args) {
        Employee jane = new Employee("jane", "jones", 123);
        Employee john = new Employee("john", "doe", 4568);
        Employee mary =  new Employee("mary", "smith", 22);
        Employee nike =  new Employee("nike", "wilson", 3245);
        Employee bill =  new Employee("bill", "cash", 78);

        SimpleHashTable ht = new SimpleHashTable();
        ht.put("jones", jane);
        ht.put("doe", john);
        ht.put("smith", mary);
        ht.put("wilson", nike);
        ht.put("cash", bill);

        ht.printHashtable(); //it brings a collisions caused by the keys

        //System.out.println(ht.get("wilson"));
        //System.out.println(ht.get("smith"));

        System.out.println("Remove");

        ht.remove("wilson");
        ht.remove("jones");
        ht.printHashtable();

        System.out.println(ht.get("smith"));
    }
}