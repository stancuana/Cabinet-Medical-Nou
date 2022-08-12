package view;

import controll.ControllAgenda;
import controll.ControllPersoana;

import java.util.Scanner;

public class ViewSecretara {

    private ControllAgenda controllAgenda;
    private ControllPersoana controllPersoana;
    private Scanner scanner;

    public ViewSecretara(){
        controllAgenda=new ControllAgenda();
        controllPersoana=new ControllPersoana();
        scanner=new Scanner(System.in);
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
