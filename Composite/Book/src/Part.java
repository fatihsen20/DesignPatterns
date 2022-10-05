import java.util.ArrayList;

public class Part implements Content {

    private String title;
    private ArrayList<Content> contentList;

    public Part(String title){
        this.title = title;
        contentList = new ArrayList<Content>();
    }

    
    @Override
    public void Add(Content content) {

        contentList.add(content);
    }

    @Override
    public Content getChild(int index) {

        return contentList.get(index);
    }

    @Override
    public void operation() {

        System.out.println("<b>"+ title + "</b>");
        for (Content cnt : contentList){
            cnt.operation();
        }
    }

    @Override
    public void remove(Content content) {

        contentList.remove(content);
    }
    
}
