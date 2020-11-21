package org.kodluyoruz.week2.hw;

import org.kodluyoruz.week2.hw.interfaces.IKeyboard;

public class Samsung extends Phone {
    public Samsung(String model, String imeiNumber, String versionNumber, int memory, double screenSize, boolean phoneIsOn , IKeyboard keyboard) {
        super(model, imeiNumber, versionNumber, memory, screenSize, phoneIsOn , keyboard);
    }

    public void listenMp3(){

        System.out.println(Main.TEXT_RED +"Your favourite song is playing" + Main.TEXT_RESET);
    }
    public void shareFile(){

        System.out.println(Main.TEXT_RED +"File successfully shared." + Main.TEXT_RESET);
    }
}
