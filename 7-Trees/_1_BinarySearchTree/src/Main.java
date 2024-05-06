public class Main {
    public static void main(String[] args) {


        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);

        //print all nodes
        intTree.traverseInOrder();
        System.out.println();

//        System.out.println(intTree.get(27));
//        System.out.println(intTree.get(17));
//        System.out.println(intTree.get(88));


        //min and max
        System.out.println(intTree.min());
        System.out.println(intTree.max());

        //delete a node case 1 and 2
        intTree.delete(15);

        //leaf
        intTree.delete(17);

        //root
        intTree.delete(25);

        intTree.traverseInOrder();

    }
}