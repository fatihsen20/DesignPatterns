import java.util.Stack;

public class TreeIterator extends Iterator {
    
    Tree start;
    Tree current;
    Stack<Tree> stack;

    public TreeIterator(Tree start){
        this.start = start;
        stack = new Stack<>();
    }

    @Override
    public void first(){
        current = start;
        stack = new Stack<>();
        stack.push(current);
    }
    @Override
    public void next(){
        if(current.left != null)
            stack.push(current.left);
        if(current.right != null)
            stack.push(current.right);
    }
    @Override
    public boolean isDone(){
        return stack.isEmpty();
    }
    @Override
    public int currentItem(){
        current = stack.pop();
        return current.getValue();
    }

}
