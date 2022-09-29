public class Main{
    public static void main(String[] args){
        Player player = new Player();
        player.muzik_ekle(new Music("Sezen Aksu-Tutuklu"));
        player.muzik_ekle(new Music("Sezen Aksu-Her Şeyi Yak"));
        player.muzik_ekle(new OggAdapter("Sertap Erener-Çakıl Taşları",1));
        // player.muzik_ekle(new OGG("Sertap Erener-Sil Baştan")); Bu satır hata verir.
        player.play();
    }
}