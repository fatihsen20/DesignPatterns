package State;

public class User implements State {
    
    private Program program;

    public User(Program program){
        this.program = program;
    }

    @Override
    public void handle(){
        System.out.println("1- User settings");
        System.out.println("2- Services 1");
        System.out.println("3- Services 2");
        System.out.println("4- Exit");

        program.exit();
    }
}
