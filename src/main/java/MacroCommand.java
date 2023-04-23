public class MacroCommand implements Command {
   Command[] comm;

    public MacroCommand(Command[] comm) {
        this.comm = comm;
    }

    @Override
    public void execute() {
        for (int i = 0; i < comm.length; i++) {
            comm[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i < comm.length; i--) {
            comm[i].undo();
        }
    }
    }

