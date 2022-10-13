package State;

public class Admin implements State {
    
    private Program program;

    public Admin(Program program){
        this.program = program;
    }

    @Override
    public void handle(){
        System.out.println("1- User add");
        System.out.println("2- User update");
        System.out.println("3- user delete");
        System.out.println("4- Exit");

        program.exit();
    }
}
