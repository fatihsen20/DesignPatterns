package Command;

public class TV {
    
    public int channel;

    public TV(){
        channel = 1;
    }

    public int getChannel(){
        return channel;
    }

    public void setChannel(int channel){
        this.channel = channel;
    }

    public void nextChannel(){
        this.channel++;
    }

    public void beforeChannel(){
        this.channel--;
    }
}
