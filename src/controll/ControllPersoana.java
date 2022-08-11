package controll;

import model.Doctor;
import model.Persoana;

import java.util.ArrayList;

public class ControllPersoana implements Controller{

    ArrayList<Persoana> persoane=new ArrayList<>();


    @Override
    public void load() {
        Utile.load(persoane,"C:\\mycode\\JavaBasics\\OOP\\Interfaces\\CabinetMedicalNou\\src\\resources\\persoane.txt","Persoane");
    }

    @Override
    public void afisare() {
        Utile.afisare(persoane);
    }

    @Override
    public void add(Object obj) {
        Persoana persoana =(Persoana)obj;
        persoane.add(persoana);

    }

    @Override
    public int nextAvailableId() {
        if(persoane.size()>0){
            return persoane.get(persoane.size()-1).getId()+1;
        }
        return 1;
    }


    @Override
    public void update(Object obj) {

    }

    @Override
    public void delete(int id) {

    }

    public int nrElemLista(){
        int nrElem=0;
        for(int i=0; i<persoane.size();i++){
            nrElem++;
        }
        return nrElem;
    }

    public int existaPersoana(String numePersoana){

        for(int i=0; i<persoane.size();i++){

            if(persoane.get(i).getNume().equals(numePersoana)){
                return 1;
            }else{
                return 0;
            }
        }
        return 4;
    }

    public int returnIdPersoanaByName(String nume){

        for(int i=0; i<persoane.size();i++){

            if(this.persoane.get(i).getNume().equals(nume)){
                return persoane.get(i).getId();
            }
        }
        return 0;
    }
}


