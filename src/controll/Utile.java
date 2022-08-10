package controll;

import model.Agenda;
import model.Doctor;
import model.Pacient;
import model.Secretara;

import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Utile {

    public static void load(ArrayList lista,String path,String className){

        try{

            File file=new File(path);
            Scanner scanner=new Scanner(file);

            while (scanner.hasNextLine()){

                String text=scanner.nextLine();

                if(className.equals("Agenda")){

                    Agenda agenda=new Agenda(text);
                    lista.add(agenda);
                }

                if(className.equals("Persoane")) {

                    if (text.split(",")[6].equals("Doctor")) {

                        Doctor doctor = new Doctor(text);
                        lista.add(doctor);
                    }

                    if (text.split(",")[6].equals("Pacient")) {

                        Pacient pacient = new Pacient(text);
                        lista.add(pacient);
                    }

                    if (text.split(",")[6].equals("Secretara")) {

                        Secretara secretara = new Secretara(text);
                        lista.add(secretara);
                    }

                }


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void afisare(ArrayList lista){

        for(int i=0;i<lista.size();i++){

            System.out.println(lista.get(i).toString());
        }
    }


}
