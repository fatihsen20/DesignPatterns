import java.util.ArrayList;

public class Player{

    public ArrayList<Music> musics;

    public Player(){
        musics = new ArrayList<Music>();
    }

    public void muzik_ekle(Music muzik){
        musics.add(muzik);
    }

    public void play(){
        System.out.println(musics.size() + "tane müzik çalıyor.");
        for (int i = 0; i < musics.size(); i++){
            musics.get(i).mp3_play();
        }
    }
}