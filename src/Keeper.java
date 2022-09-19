public class Keeper {

    public int speed;

    public Keeper(int x){
        speed = x;
    }

    public void go_print(){
        System.out.println("The keeper is going at speed: "+speed);
    }
    public void stop_print(){
        System.out.println("The keeper is stopped");
    }
}
