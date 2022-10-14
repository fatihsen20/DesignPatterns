package Factory;

public class Mercedes extends Car {

    public Mercedes(){
        maxSpeed = 350;
        currentSpeed = 0;
    }

    @Override
    public String brand() {
        return "Mercedes";
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
