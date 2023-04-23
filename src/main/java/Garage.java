public class Garage {
    String name;

    public Garage(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println("открытие двери");
    }
    public void close(){
        System.out.println("закрытие двери");
    }
    public void stop(){
        System.out.println("остановка действия");
    }


}
