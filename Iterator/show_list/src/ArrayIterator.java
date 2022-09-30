public class ArrayIterator extends Iterator {
    
    private Array_ array;
    private int index;

    public ArrayIterator(Array_ array){
        this.array = array;
        index = 0;
    }

    @Override
    public void first() {
        index = 0;
    }
    @Override
    public void next(){
        index++;
    }
    @Override
    public boolean isDone(){
        return index == array.list.size();
    }
    @Override 
    public int currentItem(){
        return array.list.get(index);
    }
}
