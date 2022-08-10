package view;

import controll.ControllAgenda;
import controll.ControllPersoana;
import model.Programare;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ViewPacient {

    private ControllPersoana controllPersoana;
    private ControllAgenda controllAgenda;
    private Scanner scanner;

    public ViewPacient() {
        controllPersoana = new ControllPersoana();
        scanner = new Scanner(System.in);
    }

    public void meniu() {
        System.out.println("Pentru a crea o noua programare apasati tasta 1");
        System.out.println("Pentru a vizualiza o programare apasati tasta 2");
        System.out.println("Pentru a modifica o programare apasati tasta 3");
        System.out.println("Pentru a anula o programare apasati tasta 4");
    }

    public void play() {
        boolean running = true;

        while (running == true) {

            meniu();

            int alegere = Integer.parseInt(scanner.nextLine());

            switch (alegere) {
                case 1:
                    programareNoua();
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

    public void programareNoua(){


        System.out.println("Introduceti numele medicului la care doriti sa realizati programarea: ");
        String numeDoctor=scanner.nextLine();

        System.out.println("Introduceti data si ora in format dd,mm,yyyy,hh,mm");

        String dateInceput=scanner.nextLine();

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd,mm,yyyy,hh,mm");
        LocalDateTime dateTime=LocalDateTime.parse(dateInceput,formatter); // am convertit dateInceput din String in LocalDateTime

        LocalDateTime dateSfarsit=controllAgenda.setDuration(dateTime); //am creat datele de Sfarsit (LocalDateTime)


        Programare programare=new Programare(dateInceput,dateSfarsit.format(formatter));

        if(controllAgenda.verificareSuprapunereProgramari(programare)==true){
            controllAgenda.add(programare);
            System.out.println("Programarea s-a realizat cu succes");
        }else{
            System.out.println("Nu se poate realiza programarea in intervalul de timp selectat");
        }
    }



}
