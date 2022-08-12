package view;

import controll.ControllPersoana;

import java.util.Scanner;

public class ViewDoctor {

    private Scanner scanner;
    private ControllPersoana controllPersoana;

    public ViewDoctor(){

        scanner=new Scanner(System.in);
        controllPersoana=new ControllPersoana();
    }

    public void meniu() {

    }

    public void play() {
        boolean running = true;

        while (running == true) {

            meniu();

            int alegere = Integer.parseInt(scanner.nextLine());

            switch (alegere) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;

                default:
                    meniu();
            }
        }
    }
}
