public class Picture implements Content {

    private String picPath;

    public Picture(String picPath){
        this.picPath = picPath;
    }

    @Override
    public void Add(Content content) {
        return;
        
    }

    @Override
    public Content getChild(int index) {
        return null;
    }

    @Override
    public void operation() {
        
        System.out.println("<img src='" + picPath + "'/>");
        
    }

    @Override
    public void remove(Content content) {
        return;
        
    }

    
    
}
