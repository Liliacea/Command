public class HottubOff implements Command{
    Hottub hottub;

    public HottubOff(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.off();
    }

    @Override
    public void undo() {
    hottub.bubbling();
    hottub.heating();
    }
}
