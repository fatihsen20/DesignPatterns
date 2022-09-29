public class OggAdapter extends Music{
    public OGG ogg;

    public OggAdapter(String name, int speed){
        super(name);
        ogg = new OGG(name, speed);
    }

    @Override
    public void mp3_play(){
        ogg.ogg_play();
    }

}