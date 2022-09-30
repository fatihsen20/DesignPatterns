public class Tree extends Aggregate {
    
    private int value;
    Tree left;
    Tree right;

    public Tree(int value){
        this.value = value;
        left = null;
        right = null;
    }

    public int getValue(){
        return value;
    }

    public void addLeft(Tree t){ left = t;}
    public void addRight(Tree t){ right = t;}

    @Override
    public Iterator createIterator() {
        return new TreeIterator(this);
    }
}
