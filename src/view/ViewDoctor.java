package view;

import controll.ControllAgenda;
import controll.ControllPersoana;
import model.Agenda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewDoctor {

    private Scanner scanner;
    private ControllPersoana controllPersoana;
    private ControllAgenda controllAgenda;

    public ViewDoctor(){

        scanner=new Scanner(System.in);
        controllPersoana=new ControllPersoana();
        controllAgenda=new ControllAgenda();
    }

    public void meniu() {

        System.out.println("Apasati tasta 1 pentru a vizualiza programarile dumneavoastra");
        System.out.println("Apasati tasta 2 pentru a vizualiza locurile libere din data aleasa");

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

    public void afisareProgramariZi(){

        System.out.println("Introduceti data pentru a vizualiza programarile: \n");

        System.out.println("Anul: ");
        int an=Integer.parseInt(scanner.nextLine());
        System.out.println("Luna: ");
        int luna=Integer.parseInt(scanner.nextLine());
        System.out.println("Ziua: ");
        int ziua=Integer.parseInt(scanner.nextLine());


        LocalDate date=LocalDate.of(an,luna,ziua);

        System.out.println("Introduceti numele dumneavoastra");
        String nume=scanner.nextLine();

        System.out.println("Programarile din data "+date+" sunt: ");

        ArrayList<Agenda> programariZi=controllAgenda.programareZi(controllPersoana.returnIdPersoanaByName(nume), date);

        for(int i=0; i<programariZi.size();i++){

            System.out.println(programariZi.get(i).toString());
        }
    }
}
