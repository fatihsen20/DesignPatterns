package Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getNumber());
        singleton.setNumber(10);
        System.out.println(singleton.getNumber());
        singleton.setNumber(101);

        //singleton2 object references the same object as singleton
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.getNumber());
    }
}
