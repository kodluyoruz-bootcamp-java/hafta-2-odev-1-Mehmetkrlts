package org.kodluyoruz.week2.hw;

import org.kodluyoruz.week2.hw.interfaces.IKeyboard;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_RESET = "\u001B[0m";
    public static void main(String[] args) {
        welcomePage();
    }
 
    public static void welcomePage(){
        System.out.println("Welcome to phone tester!");
        System.out.println("1-Samsung\n2-Apple");
        System.out.print("Enter a number for selecting phone brand to continue:");
        try {
            Scanner scan = new Scanner(System.in);
            int selectedPhoneBrand = scan.nextInt();

            if(selectedPhoneBrand == 1 ){
                IKeyboard nonTouchKeyboard = new NonTouchKeyboard();
                Samsung samsung = new Samsung("M.O3000","0000001","V1.5",8192,
                        6.5,false , nonTouchKeyboard);
                samsung.openPhone();
                samsungMenu(samsung);

            }
            else if (selectedPhoneBrand == 2) {
                IKeyboard touchKeyboard = new TouchKeyboard();
                Apple apple = new Apple("Iphone11" , "0000000","V1.0",4096 ,
                        5.5 ,false , touchKeyboard);
                apple.openPhone();
                appleMenu(apple);
            }
            else{
                System.out.println("Please enter a valid number\n");
                welcomePage(); }

        } catch(InputMismatchException e) {
            System.out.println("Please enter a valid number\n");
            welcomePage();
        }
    }

    public static void appleMenu(Apple apple){
        System.out.println("With samsung phone you can make these operations\n1-Call a person\n2-Send a message" +
                "\n3-Make a video call\n4-Share Screen\n5-Show information of phone\n6-Close phone\n7-Change phone");
        System.out.print("Enter a number for selecting operation:");
        try {
            Scanner scan = new Scanner(System.in);
            int operationNumber = scan.nextInt();
            switch(operationNumber) {
                case 1:
                    apple.call();
                    wantToContinue(apple);
                    break;

                case 2:
                    apple.sendMessage();
                    wantToContinue(apple);
                    break;

                case 3:
                    apple.makevideocall();
                    wantToContinue(apple);
                    break;


                case 4:
                    apple.screenShare();
                    wantToContinue(apple);
                    break;

                case 5:
                    apple.printInformationOfPhone();
                    wantToContinue(apple);
                    break;
                case 6:
                    apple.closePhone();
                    break;

                case 7:
                    apple.closePhone();
                    welcomePage();
                    break;

                default:
                    System.out.println("Invalid operation please enter a valid operation");
                    appleMenu(apple);
            }
        }
        catch(InputMismatchException e){
            System.out.println("You can only enter a number try again with instructions");
            appleMenu(apple);

        }
    }

    public static void samsungMenu(Samsung samsung){
        System.out.println("With samsung phone you can make these operations\n1-Call a person\n2-Send a message" +
                "\n3-Share a file\n4-Play Mp3 music\n5-Show information of phone\n6-Close phone\n7-Change Phone");
        System.out.print("Enter a number for selecting operation:");
        try {
            Scanner scan = new Scanner(System.in);
            int operationNumber = scan.nextInt();
            switch(operationNumber) {
                case 1:
                    samsung.call();
                    wantToContinue(samsung);
                    break;

                case 2:
                    samsung.sendMessage();
                    wantToContinue(samsung);
                    break;

                case 3:
                    samsung.shareFile();
                    wantToContinue(samsung);
                    break;


                case 4:
                    samsung.listenMp3();
                    wantToContinue(samsung);
                    break;

                case 5:
                    samsung.printInformationOfPhone();
                    wantToContinue(samsung);
                    break;
                case 6:
                    samsung.closePhone();
                    break;

                case 7:
                    samsung.closePhone();
                    welcomePage();
                    break;

                default:
                    System.out.println("Invalid operation please enter a valid operation");
                    samsungMenu(samsung);
            }
        }
        catch(InputMismatchException e){
            System.out.println("You can only enter a number try again with instructions");
            samsungMenu(samsung);

        }
        }
        public static void wantToContinue(Phone phone) {
            try {
                System.out.print("You want to continue?\n1-Continue\n2-Close phone\nSelect operation:");
                Scanner scan = new Scanner(System.in);
                int yesOrNo = scan.nextInt();
                if (yesOrNo == 1) {
                    if (phone instanceof Samsung) {

                        samsungMenu((Samsung) phone);
                    } else
                        appleMenu((Apple) phone);
                } else if (yesOrNo == 2) {
                    phone.closePhone();
                } else {
                    System.out.println("Enter a valid number");
                    wantToContinue(phone);
                }
            }
            catch (InputMismatchException e){
                System.out.println("Enter a valid number");
                wantToContinue(phone);
            }

        }
    }

