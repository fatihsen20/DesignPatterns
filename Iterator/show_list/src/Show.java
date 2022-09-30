public class Show {
    
    public static void show(Aggregate aggregate){

        Iterator iterator = aggregate.createIterator();
        for(iterator.first(); !iterator.isDone(); iterator.next()){
            System.out.println(iterator.currentItem());
        }
    }
}
