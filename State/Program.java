package State;

public class Program {
    
    private State state;

    public Program(){
        state = new Undefined(this);
    }

    public void run(){
        state.handle();
    }

    public void login(){
        state = new User(this);
        run();
    }

    public void admin(){
        state = new Admin(this);
        run();
    }

    public void exit(){
        state = new Undefined(this);
    }
}
