package Command;

public class NextChannel implements Command {
    
    private TV tv;

    public NextChannel(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute(){
        tv.nextChannel();
        System.out.println("Current Channel: " + tv.getChannel());
    }

    @Override
    public String toString(){
        return "Next Channel";
    }
}
