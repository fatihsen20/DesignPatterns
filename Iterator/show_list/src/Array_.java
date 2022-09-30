import java.util.ArrayList;

public class Array_ extends Aggregate{

    public ArrayList<Integer> list;

    public Array_(){
        list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(9);
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIterator(this);
    }
}
