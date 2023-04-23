public class CeilingFanOffComand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;
    public CeilingFanOffComand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        if(prevSpeed == CeilingFan.high){
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.medium){
            ceilingFan.low();
        } else if(prevSpeed==CeilingFan.low){
            ceilingFan.off();
        } else {
            ceilingFan.high();
        }
    }
}

