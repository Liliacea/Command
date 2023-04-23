public class HottubBubbling implements Command{
    Hottub hottub;

    public HottubBubbling(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.bubbling();
    }

    @Override
    public void undo() {
        hottub.off();
    }
}
