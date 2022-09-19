public class Human {
    public String name;
    public double height;
    public double weight;

    public Human(String x, double y, double z){
        name = x;
        height = y;
        weight = z;
    }

    public void print(){
        System.out.println("Their name: "+name+". Their height: "+height+". Their weight: "+weight+".");
    }

}
