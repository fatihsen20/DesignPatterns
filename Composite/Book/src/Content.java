public interface Content {

    public void operation();
    public void Add(Content content);
    public void remove(Content content);
    public Content getChild(int index);
}
