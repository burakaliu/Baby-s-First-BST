public class Main {
    public static void main(String[] args) {
        
        //sorry future me for lack of comments, i was very tired when I wrote this code
        
        BST<Integer> tree = new BST<Integer>();
        System.out.println("\n inserting 1 now");
        tree.insert(1);
        System.out.println("\n inserting 5 now");
        tree.insert(5);
        System.out.println("\n inserting 4 now");
        tree.insert(4);
        System.out.println("\n inserting 7 now");
        tree.insert(7);

        tree.orderPrinti();

        System.out.println(tree.exists(4));

    }
}
