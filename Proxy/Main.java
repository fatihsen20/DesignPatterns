package Proxy;

public class Main {

    public static void info(Graphic graphic){
        graphic.graphicInfo();
    }

    public static void drawScreen(Graphic graphic){
        graphic.draw();
    }

    public static void main(String[] args) {
        ImageProxy imageProxy = new ImageProxy("image.jpg");
        info(imageProxy);
        drawScreen(imageProxy);

        ImageProxy imageProxy2 = new ImageProxy("photo.jpg");
        info(imageProxy2);
        drawScreen(imageProxy2);
        drawScreen(imageProxy);
    }
    
}
