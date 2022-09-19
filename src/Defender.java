public class Defender {
    public int speed;

    public Defender(int y){
        speed = y;
    }

    public void go_print(){
        System.out.println("The defender is going at speed: "+speed);
    }
    public void stop_print(){
        System.out.println("The defender is stopped");
    }
}

