package Factory;

public class Audi extends Car {

    public Audi(){
        maxSpeed = 300;
        currentSpeed = 0;
    }

    @Override
    public String brand() {
        return "Audi";
    }

    @Override
    public void changeSpeed(int s) {
        currentSpeed = s;
        
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
    
}
