public class App {
    public static void main(String[] args) throws Exception {
        Part book = new Part("Introduction to Design Patterns"); 
        Part chapter1 = new Part("Chapter 1");
        chapter1.Add(new Text_("Design Patterns Overview"));
        chapter1.Add(new Text_("Design Patterns Types"));
        Part chapter12 = new Part("Chapter 1.2");
        chapter12.Add(new Text_("Creational Patterns"));
        chapter12.Add(new Text_("Structural Patterns"));
        chapter12.Add(new Text_("Behavioral Patterns"));
        chapter1.Add(chapter12);

        Part chapter2 = new Part("Chapter 2");
        chapter2.Add(new Text_("Adapter Pattern"));
        chapter2.Add(new Text_("Bridge Pattern"));

        book.Add(chapter1);
        book.Add(chapter2);

        ShowContent(book);
        System.out.println();
        ShowContent(chapter12);

    }

    public static void ShowContent(Content content){
        content.operation();
    }
}
