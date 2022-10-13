package Command;

public class Lamp {
    
    public int lamp;

    public Lamp(){
        lamp = 0;
    }

    public void lampOpen(){
        System.out.println("Lamp is opened!");
        this.lamp = 1;
    }

    public void lampCLose(){
        System.out.println("Lamp is closed!");
        this.lamp = 0;
    }

    public int getLamp(){
        return this.lamp;
    }
}
