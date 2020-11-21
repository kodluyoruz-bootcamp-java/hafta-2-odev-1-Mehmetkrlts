package org.kodluyoruz.week2.hw;

public class Phone {
    private String model;
    private String imeiNumber;
    private String versionNumber;
    private int memory;
    private double screenSize;
    private boolean phoneIsOn;
    private KeyBoard keyboard;

    public Phone(String model, String imeiNumber, String versionNumber, int memory, double screenSize, boolean phoneIsOn , KeyBoard keyboard) {
        this.model = model;
        this.imeiNumber = imeiNumber;
        this.versionNumber = versionNumber;
        this.memory = memory;
        this.screenSize = screenSize;
        this.phoneIsOn = phoneIsOn;
        this.keyboard = keyboard;
    }

    public void printInformationOfPhone(){
        System.out.printf(Main.TEXT_RED +"Phone Model:%s\nIMEI number:%s\nVersion Number:%s\nMemory:%d MB\nScreen size:%.1f Inc\n"
               + Main.TEXT_RESET ,this.model,this.imeiNumber,this.versionNumber,this.memory,this.screenSize);
        keyboard.uses();
    }

    public void call(){

        System.out.println(Main.TEXT_RED+"Phone call was successful." + Main.TEXT_RESET);
    }

    public void sendMessage(){

        System.out.println(Main.TEXT_RED +"Message sended." + Main.TEXT_RESET);
    }

    public void openPhone(){

        this.phoneIsOn = true;
    }

    public void closePhone(){
        this.phoneIsOn = false;
        System.out.println(Main.TEXT_RED + "Phone closed" + Main.TEXT_RESET);
    }
}
