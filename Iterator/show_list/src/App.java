public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //List Implementation
        Show.show(new Array_());
        
        System.out.println("------------------------------------");

        //Tree Implementation
        Tree tree = new Tree(10);
        Tree left = new Tree(8);
        Tree right = new Tree(12);
        Tree right2 = new Tree(14);
        Tree right_left = new Tree(11);
        tree.addLeft(left);
        tree.addRight(right);
        right.addRight(right2);
        right.addLeft(right_left);

        Show.show(tree);
    }
}
