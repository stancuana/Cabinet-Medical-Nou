package view;

import controll.ControllAgenda;
import controll.ControllPersoana;
import model.Agenda;
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
        controllAgenda=new ControllAgenda();
        scanner = new Scanner(System.in);
    }

    public void meniu() {
        System.out.println("Pentru a crea o noua programare apasati tasta 1");
        System.out.println("Pentru a vizualiza locurile disponibile la data aleasa apasati tasta 2");
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

        System.out.println("Introduceti numele dumneavoastra: ");
        String nume=scanner.nextLine();

        System.out.println("Introduceti numele medicului la care doriti sa realizati programarea: ");
        String numeDoctor=scanner.nextLine();

        System.out.println("Introduceti data si ora in format dd,mm,yyyy,hh,mm");

        String dateInceput=scanner.nextLine();
        Programare programare = new Programare(dateInceput,30);
        Agenda agenda= new Agenda(controllAgenda.nextAvailableId(),controllPersoana.returnIdPersoanaByName(numeDoctor),controllPersoana.returnIdPersoanaByName(nume),programare);


        if(controllAgenda.verificareSuprapunereProgramari(agenda)==false){
            controllAgenda.add(agenda);
            System.out.println("Programarea s-a realizat cu succes!");
        }else{
            System.out.println("Nu se poate efectua o programare in intervalul de timp selectat");
        }
    }

    public void afisareLocuriLibereZi(){

        System.out.println("Introduceti numele medicului ale carui programari doriti sa le vizulizati: ");
        String numeMedic=scanner.nextLine();

        System.out.println("Introduceti data pentru care doriti sa vizualizati locurile libere: ");
    }

}
