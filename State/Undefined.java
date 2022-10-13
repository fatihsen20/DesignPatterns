package State;

public class Undefined implements State {
    
    private Program program;

    public Undefined(Program program){
        this.program = program;
    }

    @Override
    public void handle(){
        System.out.println("1- Please Register");
        System.out.println("2- Login");
        System.out.println("3- Admin panel");

        program.login();
    }
}
