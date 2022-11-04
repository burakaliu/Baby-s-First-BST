public class BST <T>
{
    BSTNode root;
    /**
     * Put BST code here, you can use the Node
     * defined below since it is a NESTED CLASS
     *
     * I've modified the BSTNode and put some example
     * code in the insert method to show how to use
     * compareTo instead of < or >
     */
    public void insert(T insertMe){
        root = insert(insertMe, root);
    }

    private BSTNode insert(T insertMe, BSTNode node) {
        BSTNode insertNode = new BSTNode(insertMe);

        if (node == null){
            System.out.println("node was null assigned insertme to node");
            return insertNode;
        }else if (insertNode.compareTo(node) < 0) {
            System.out.println("insertMe: " + insertMe + "   node.get: "+ node.get() + "    compared: " + insertNode.compareTo(node));
            System.out.println("less than");
            System.out.println(node.left);
            node.setLeft(insert(insertMe, node.left));
        }else if(insertNode.compareTo(node) > 0){
            System.out.println("insertMe: " + insertMe + "   node.get: "+ node.get() + "    compared: " + insertNode.compareTo(node));
            System.out.println("greater than");
            System.out.println(node.right);
            //System.out.println(node.right.value);
            node.setRight(insert(insertMe, node.right));
        }
        return node;
    }

    public void orderPrinti(){
        orderPrint(root);
    }

    private void orderPrint(BSTNode node){
        if (node == null){
            return;
        }
        orderPrint(node.getLeft());
        System.out.println(node.get());
        orderPrint(node.getRight());
    }

    public boolean exists(T checkMe){
        return exists(checkMe, root);
    }

    private boolean exists(T checkMe, BSTNode node){
        BSTNode checkNode = new BSTNode(checkMe);
        if (node == null){
            return false;
        }else if(node.compareTo(checkNode) > 0){
            return exists(checkMe, node.getLeft());
        } else if (node.compareTo(checkNode) < 0) {
            return exists(checkMe, node.getRight());
        }else if (checkMe == node.value){
            return true;
        }
        return true;
    }

    public class BSTNode implements Comparable
    {
        T value;
        BSTNode left;
        BSTNode right;

        public BSTNode(T val) {
            value = val;
        }

        public T get() {
            return value;
        }

        public void set(T val) {
            value = val;
        }

        public BSTNode getLeft() {
            return left;
        }

        public void setLeft(BSTNode n) {
            left = n;
        }

        public BSTNode getRight() {
            return right;
        }

        public void setRight(BSTNode n) {
            right = n;
        }


        public int compareTo(Object o) {
            BSTNode n = (BSTNode) o;
            return ((Comparable)value).compareTo((Comparable) n.get());
        }
    }
}