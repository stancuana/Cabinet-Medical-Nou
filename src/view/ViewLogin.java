package view;

import controll.ControllPersoana;

import java.util.Scanner;

public class ViewLogin {

    private ControllPersoana controllPersoana;
    private Scanner scanner;
    private ViewDoctor viewDoctor;
    private ViewSecretara viewSecretara;
    private ViewPacient viewPacient;

    public ViewLogin(){

        scanner=new Scanner(System.in);
        controllPersoana=new ControllPersoana();
        viewDoctor=new ViewDoctor();
        viewPacient=new ViewPacient();
        viewSecretara=new ViewSecretara();
    }

    public void meniu(){

        System.out.println("Daca sunteti pacient apasati tasta 1");
        System.out.println("Daca sunteti cadru medical apasati tasta 2");
        System.out.println("Daca sunteti secretara apasati tasta 3");
    }



    public void play(){

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

                default:
                    meniu();
            }
        }
    }

    public void logarePersoana(){

        System.out.println("Introduceti email-ul: ");
        String email=scanner.nextLine();

        System.out.println("Introduceti parola: ");
        String password=scanner.nextLine();

        if(controllPersoana.returnPersoanaByEmail(email,password)!=null){
            System.out.println("V-ati logat cu succes");
            viewDoctor.play();

        }else{

            System.out.println("Email sau parola incorecte");
        }
    }

    public void logarePersoana2(){

        if()
    }
}
