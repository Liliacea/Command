public class Light {
    String roomName;
    public Light(String roomName) {
        this.roomName = roomName;

    }

    public void on(){
        System.out.println("свет включается");
    }
    public void off(){
        System.out.println("свет выключается");
    }
}
