package Command;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        LampOpenClose command_lamp = new LampOpenClose(new Lamp());
        TV tv = new TV();
        BeforeChannel command_before = new BeforeChannel(tv);
        NextChannel command_next = new NextChannel(tv);

        menu.addCommand(command_lamp);
        menu.addCommand(command_before);
        menu.addCommand(command_next);

        menu.menu();
    }
}
