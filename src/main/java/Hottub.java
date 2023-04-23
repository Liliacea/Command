public class Hottub {
    public String location;

    public Hottub(String location) {
        this.location = location;
    }
    public void heating(){
        System.out.println("нагрев джакузи");
    }
    public void bubbling(){
        System.out.println("пузырение джакузи");
    }
    public void off(){
        System.out.println("страшна, вырубай джакузю");
    }
}
