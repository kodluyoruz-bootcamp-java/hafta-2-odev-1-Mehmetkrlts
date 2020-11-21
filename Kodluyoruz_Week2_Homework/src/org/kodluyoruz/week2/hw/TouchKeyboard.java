package org.kodluyoruz.week2.hw;

import org.kodluyoruz.week2.hw.interfaces.IKeyboard;

public class TouchKeyboard implements IKeyboard {
    @Override
    public void uses() {
        System.out.println(Main.TEXT_RED + "This phone use touch-sensetive keyboard" + Main.TEXT_RESET);
    }
}
