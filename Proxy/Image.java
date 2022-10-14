package Proxy;

public class Image extends Graphic {
    
    private byte[] data;

    public Image(String filePath){
        this.filePath = filePath;
        data = null;
    }

    @Override
    public void draw(){
        if(data == null){
            System.out.println("File loading... "+ filePath);
            data = new byte[1000000];
            System.out.println("File drawing... ("+ filePath+ " )");
        }
        else{
            System.out.println("File drawing... ("+ filePath+ " )");
        }
    }

    @Override
    public void graphicInfo(){}
}
