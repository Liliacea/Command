public class GarageDoorCloseComand implements Command{
    Garage garage;

    public GarageDoorCloseComand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.close();

    }

    @Override
    public void undo() {
        garage.open();
    }
}
