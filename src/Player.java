public class Player {

    public Keeper keeper;
    public Defender defender;
    public Human human;

    public Player (){
        keeper = new Keeper(40);
        defender = new Defender(25);
        human = new Human("Fred", 6.11, 250);
        go();
        stop();
    }

    public void go(){

        System.out.println("Go!");
        keeper.go_print();
        defender.go_print();
        human.print();
    }

    public void stop(){

        System.out.println("Stop!");
        keeper.stop_print();
        defender.stop_print();
    }

    public static void main(String[] args) {
        Player myApp = new Player();
    }

}
