package Factory;

public abstract class Car {
    
    public int maxSpeed;
    public int currentSpeed;

    public abstract int getMaxSpeed();
    public abstract String brand();
    public abstract void changeSpeed(int s);
}
