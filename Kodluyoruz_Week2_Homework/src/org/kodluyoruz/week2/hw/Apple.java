package org.kodluyoruz.week2.hw;

import org.kodluyoruz.week2.hw.interfaces.IKeyboard;

public class Apple extends Phone {
    public Apple(String model, String imeiNumber, String versionNumber, int memory,
                 double screenSize, boolean phoneIsOn , IKeyboard keyBoard) {
        super(model, imeiNumber, versionNumber, memory, screenSize, phoneIsOn, keyBoard);
    }

    public void makevideocall(){
        System.out.println(Main.TEXT_RED + "Video call completed successfully" + Main.TEXT_RESET);
    }
    public void screenShare(){
        System.out.println(Main.TEXT_RED +"Screen shared"+ Main.TEXT_RESET);
    }

}
