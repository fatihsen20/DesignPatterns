package Factory;

public class AudiFactory extends CarFactory{
    
    @Override
    public Car buildCar(){
        return new Audi();
    }
}
