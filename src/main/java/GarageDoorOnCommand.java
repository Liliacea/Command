public class GarageDoorOnCommand implements Command {
    Garage garage;

    public GarageDoorOnCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.open();

    }

    @Override
    public void undo() {
        garage.close();
    }
}
