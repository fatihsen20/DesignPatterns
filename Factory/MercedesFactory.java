package Factory;

public class MercedesFactory extends CarFactory {
    
    @Override
    public Car buildCar(){
        return new Mercedes();
    }
}
