package controll;

import model.Agenda;
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

    public int pozById(int id){

        int poz=-1;

        for(int i = 0; i< persoane.size(); i++){
            if(persoane.get(i).getId()==id)
                poz=i;
        }
        return poz;
    }

    @Override //???
    public void update(Object obj) {
        Persoana persoana = (Persoana) obj;

        int poz = pozById(persoana.getId());
        if(poz>-1){
            this.persoane.get(poz).setNume(persoana.getNume());
            this.persoane.get(poz).setPrenume(persoana.getPrenume());
            this.persoane.get(poz).setVarsta(persoana.getVarsta());
            this.persoane.get(poz).setTip(persoana.getTip());
            this.persoane.get(poz).setEmail(persoana.getEmail());
            this.persoane.get(poz).setPassword(persoana.getPassword());
            if(this.persoane.get(poz).getTip().equals("Doctor")){

                Doctor doctor=(Doctor) obj;
                poz=pozById(doctor.getId());
                if(poz>-1){


                }
            }
        }

    }

    @Override
    public void delete(int id) {
        int poz=pozById(id);
        if(poz>-1){
            this.persoane.remove(poz);
        }
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
    } //???

    public int returnIdPersoanaByName(String nume){

        for(int i=0; i<persoane.size();i++){

            if(this.persoane.get(i).getNume().equals(nume)){
                return persoane.get(i).getId();
            }
        }
        return 0;
    }

    public Persoana returnPersoanaByEmail(String email,String password){

        for(int i=0; i<persoane.size();i++){

            if(persoane.get(i).getEmail().equals(email) && persoane.get(i).getPassword().equals(password)){
                return persoane.get(i);
            }
        }
        return null;
    }
}


