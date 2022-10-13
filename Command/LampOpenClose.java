package Command;

public class LampOpenClose implements Command {
    
    public Lamp lamp;
    
    public LampOpenClose(Lamp lamp){
        this.lamp = lamp;
    }

    @Override
    public void execute(){
        if(lamp.getLamp() == 1) lamp.lampCLose();
        else lamp.lampOpen();
    }

    @Override
    public String toString(){
        if(lamp.getLamp() == 1) return "Turn off the lamp";
        else return "Turn on the lamp";
    }
}
