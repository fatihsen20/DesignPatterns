public class Text_ implements Content {

    private String textContent;

    public Text_(String textContent){
        this.textContent = textContent;
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

        System.out.println("<b>"+ textContent + "</b>");
    }

    @Override
    public void remove(Content content) {
        return;  
    }
    
}
