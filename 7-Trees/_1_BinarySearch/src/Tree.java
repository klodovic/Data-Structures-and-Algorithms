public class Tree {
    private TreeNode root;

    public void insert(int value){
        if (root == null){
            root = new TreeNode(value);
        }
        else {
            root.insert(value);
        }
    }

    public TreeNode get(int value){
        if (root != null){
            return root.get(value);
        }
        return null;
    }

    public void delete(int value){
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subRoot, int value) {
        if (subRoot == null){
            return subRoot;
        }
        if (value < subRoot.getData()){
            subRoot.setLeftChild(delete(subRoot.getLeftChild(), value));
        }
        else if (value > subRoot.getData()){
            subRoot.setRightChild(delete(subRoot.getRightChild(), value));
        }
        else {
            //Cases 1 and 2: node to delete has 0 or 1 child(ren)
            if (subRoot.getLeftChild() == null){
                return subRoot.getRightChild();
            } else if (subRoot.getRightChild() == null) {
                return subRoot.getLeftChild();
            }

            //Case 3 has to delete has 2 children
            subRoot.setData(subRoot.getRightChild().min());
            //delete the node that has the smallest value in the right subTree
            subRoot.setRightChild(delete(subRoot.getRightChild(), subRoot.getData()));
        }
        return subRoot;
    }

    public int min(){
        if (root == null){
            return Integer.MIN_VALUE;
        }
        else {
            return root.min();
        }
    }

    public int max(){
        if (root == null){
            return Integer.MAX_VALUE;
        }
        else {
            return root.max();
        }
    }


    public void traverseInOrder(){
        if (root != null){
            root.traverseInOrder();
        }
    }




}
