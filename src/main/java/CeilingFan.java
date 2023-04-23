public class CeilingFan {
    public static final int high = 3;
    public static final int medium = 2;
    public static final int low = 1;
    public static final int off = 0;
    public  String location;
    int speed;

    public CeilingFan(String location) {

        this.location = location;
        this.speed = off;
    }

    public void high(){
        speed = high;
        System.out.println("высокая скорость");
    }
    public void medium(){
        speed = medium;
        System.out.println("средняя скорость");
    }
    public void low(){
        speed = low;
        System.out.println("низкая скорость");
    }
    public void off(){
        speed = off;
        System.out.println("отключен");
    }

    public int getSpeed() {
        return speed;
    }


}
