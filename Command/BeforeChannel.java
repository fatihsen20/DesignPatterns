package Command;

public class BeforeChannel implements Command {
    
    private TV tv;

    public BeforeChannel(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute(){
        tv.beforeChannel();
        System.out.println("Current Channel: "+tv.getChannel());
    }

    @Override
    public String toString(){
        return "Before Channel";
    }
}
