package model;

public class Secretara extends Persoana{

    public Secretara(String atribute){
        super(atribute);
    }

    public Secretara(int id, String nume, String prenume, int varsta, String email, String password){
        super(id,nume,prenume,varsta,email,password,"Secretara");
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public int compareTo(Persoana persoana) {
        return super.compareTo(persoana);
    }
}
