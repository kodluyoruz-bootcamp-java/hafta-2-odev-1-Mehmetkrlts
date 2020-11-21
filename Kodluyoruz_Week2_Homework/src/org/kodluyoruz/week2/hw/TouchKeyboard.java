package org.kodluyoruz.week2.hw;

public class TouchKeyboard implements KeyBoard{
    @Override
    public void uses() {
        System.out.println(Main.TEXT_RED + "This phone use touch-sensetive keyboard" + Main.TEXT_RESET);
    }
}
