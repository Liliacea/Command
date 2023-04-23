public class RemoteControlTest {
    public static void main(String[] args) {

            SimpleRemoteControl remoteControl = new SimpleRemoteControl();
            Light livingRoomLight = new Light("Living Room");
            Garage garage = new Garage("гараж");
            CeilingFan ceilingFan = new CeilingFan("Living room");
            LightOnCommand livingRoomLightOn =
                    new LightOnCommand(livingRoomLight);
            LightOffCommand livingRoomLightOff =
                    new LightOffCommand(livingRoomLight);
            GarageDoorOnCommand garageDoorOnCommand =
                    new GarageDoorOnCommand(garage);
            GarageDoorCloseComand garageDoorCloseComand =
                    new GarageDoorCloseComand(garage);
            CeilingHighCommand ceilingHighCommand =
                    new CeilingHighCommand(ceilingFan);
            CeilingFanOffComand ceilingFanOffComand =
                    new CeilingFanOffComand(ceilingFan);

            TV tv = new TV("Living Room");
            Stereo stereo = new Stereo("Living Room");
            Hottub hottub = new Hottub("bathroom");

            StereoOn stereoOn = new StereoOn(stereo);
            TVOn tvOn = new TVOn(tv);
            HottubBubbling hottubBubbling = new HottubBubbling(hottub);
            StereoOff stereoOff = new StereoOff(stereo);
            TVOff tvOff = new TVOff(tv);
            HottubOff hottubOff = new HottubOff(hottub);


            Command[] partyOn = {stereoOn, tvOn, hottubBubbling};
            Command[] partyOff = {stereoOff, tvOff, hottubOff};

            MacroCommand partyOnMacro = new MacroCommand(partyOn);
            MacroCommand partyOffMacro = new MacroCommand(partyOff);


        /*    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
            remoteControl.onButtonWasPushed(0);
            remoteControl.offButtonWasPushed(0);
            System.out.println(remoteControl);
            remoteControl.setCommand(1,garageDoorOnCommand, garageDoorCloseComand);
            remoteControl.onButtonWasPushed(1);
            remoteControl.offButtonWasPushed(1);
            remoteControl.undoButtonWasPushed();
            System.out.println(remoteControl);
            remoteControl.setCommand(2, ceilingHighCommand, ceilingFanOffComand);
            remoteControl.onButtonWasPushed(2);
            remoteControl.offButtonWasPushed(2);
            remoteControl.undoButtonWasPushed();
            System.out.println(remoteControl);

         */

            remoteControl.setCommand(3,partyOnMacro,partyOffMacro);
            remoteControl.undoButtonWasPushed();

            System.out.println(remoteControl);

            System.out.println("--- Pushing Macro On---");
            remoteControl.onButtonWasPushed(3);
            System.out.println("--- Pushing Macro Off---");
            remoteControl.offButtonWasPushed(3);


        }
}
