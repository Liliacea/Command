public class HottubHeating implements Command{
    Hottub hottub;

    public HottubHeating(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.heating();
    }

    @Override
    public void undo() {
        hottub.off();
    }
}
