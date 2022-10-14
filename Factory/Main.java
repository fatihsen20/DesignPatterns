package Factory;

public class Main {

    public static void car(CarFactory factory){
        Car car = factory.buildCar();
        System.out.println(car.brand() + " Builded!");
    }
    public static void main(String[] args) {
        car(new AudiFactory());
        car(new MercedesFactory());
    
    }
    
}
