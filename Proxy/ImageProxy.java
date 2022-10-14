package Proxy;

public class ImageProxy extends Graphic{
    
    private Image image;

    public ImageProxy(String filePath){
        this.filePath = filePath;
        image = new Image(filePath);
    }

    @Override
    public void draw(){
        image.draw();
    }

    @Override
    public void graphicInfo(){
        System.out.println("File name: "+ filePath);
    }
}
