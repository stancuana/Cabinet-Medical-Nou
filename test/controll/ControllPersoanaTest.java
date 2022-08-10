package controll;

import model.Doctor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllPersoanaTest {

    @Test
    public void loadSiAfisareTest() {

        ControllPersoana controllPersoana = new ControllPersoana();

        controllPersoana.load();
        controllPersoana.afisare();


    }

    @Test
    public void addTest() {


        Doctor doctor = new Doctor(4, "jasnxnas", "snxax", 34, "lkasmxm", "ksmx", "jsxasx", "ksmxks");
        ControllPersoana controllPersoana = new ControllPersoana();
        int nrFinalElemLista = controllPersoana.nrElemLista();
        controllPersoana.add(doctor);


        assertEquals(nrFinalElemLista + 1, controllPersoana.nrElemLista());
    }

    @Test
    public void existaPersoanaTest(){

        ControllPersoana controllPersoana=new ControllPersoana();

        assertEquals(4,controllPersoana.existaPersoana("Frincu"));
    }

}