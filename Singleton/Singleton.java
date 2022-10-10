package Singleton;

public class Singleton {
    
    private int number;

    private Singleton(){
        number = 0;
    }

    protected int getNumber(){
        return number;
    }

    protected void setNumber(int number){
        this.number = number;
    }

    private static Singleton instance = null;

    public static Singleton getInstance(){
        if (instance == null)
            instance = new Singleton();
        
        return instance;
    }
}
