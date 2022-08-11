package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Liber extends Programare{


    public Liber(String dateInceput, String dateSfarsit) {
        super(dateInceput, dateSfarsit);
    }

    public Liber(String dateInceput, int durata) {
        super(dateInceput, durata);
    }

    public Liber(LocalDateTime dateInceput, LocalDateTime dateSfarsit) {
        super(dateInceput, dateSfarsit);
    }

    @Override
    public String toString(){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm:ss a");
        return "Este liber: "+dateInceput.format(formatter)+"\n"+
                "Final: "+dateSfarsit.format(formatter)+"\n"+
                "Durata: "+this.getDurata().toMinutes()+" minute";
    }
}
