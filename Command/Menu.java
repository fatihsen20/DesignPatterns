package Command;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    private ArrayList<Command> commands;

    public Menu(){
        commands = new ArrayList<Command>();
    }

    public void addCommand(Command command){
        commands.add(command);
    }

    public void menu(){
        Scanner sc = new Scanner(System.in);
        int s = 0;
        while(s != -1){
            for(int i = 0; i < commands.size(); i++){
                System.out.println(i + ": " + commands.get(i));
            }
            System.out.println("Exit ==> press -1");
            try{
                s = sc.nextInt();
                commands.get(s).execute();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        sc.close();
            
    }
}