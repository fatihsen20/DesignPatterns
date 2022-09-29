public class OGG{
    public String name;
    public int speed;
    public OGG(String name , int speed){
        this.name = name;
        this.speed = speed;
    }

    public void ogg_play(){
        System.out.println("Muzik caliniyor: " + this.name + " " + this.speed + " hizinda");
    }
}