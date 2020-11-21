package org.kodluyoruz.week2.hw;

public class NonTouchKeyboard implements KeyBoard {
    @Override
    public void uses() {
        System.out.println(Main.TEXT_RED + "This phone use button keyboard" + Main.TEXT_RESET);
    }
}
