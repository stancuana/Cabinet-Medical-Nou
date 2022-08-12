package controll;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ControllAgendaTest {

    @Test
    public void loadAfisareTest(){

        ControllAgenda controllAgenda=new ControllAgenda();

        controllAgenda.afisare();
    }

    @Test
    public void returnProgramariByIdTest(){

        ControllAgenda controllAgenda=new ControllAgenda();

        ArrayList lista=controllAgenda.returnProgramariById(3);

        for(int i=0; i<lista.size();i++){

            System.out.println(lista.get(i).toString());
        }
    }

    @Test
    public void programareZiTest(){

        ControllAgenda controllAgenda=new ControllAgenda();
        ArrayList lista=controllAgenda.programareZi(3, LocalDate.of(2022,8,1));

        for(int i=0; i<lista.size();i++){

            System.out.println(lista.get(i).toString());
        }

    }

    @Test
    public void locuriLibereZiTest(){

        ControllAgenda controllAgenda=new ControllAgenda();

        ArrayList locuriLibere=controllAgenda.locuriLibereByDate(1,LocalDate.of(2022,8,1));

        for(int i=0;i<locuriLibere.size();i++){

            System.out.println(locuriLibere.get(i).toString());
        }
    }

}