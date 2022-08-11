package model;

public class Agenda  implements Comparable<Agenda>{

    private int id;
    private int doctorId;
    private int pacientId;
    private Programare programare;


    public Agenda(int id,int doctorId, int pacientId, Programare programare){
        this.id=id;
        this.doctorId=doctorId;
        this.pacientId=pacientId;
        this.programare=programare;
    }

    public Agenda(String atribute){

        this.id=Integer.parseInt(atribute.split("-")[0]);
        this.doctorId=Integer.parseInt(atribute.split("-")[1]);
        this.pacientId=Integer.parseInt(atribute.split("-")[2]);
        this.programare=new Programare(atribute.split("-")[3],atribute.split("-")[4]);
    }


    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getPacientId() {
        return pacientId;
    }

    public void setPacientId(int pacientId) {
        this.pacientId = pacientId;
    }

    public Programare getProgramare() {
        return programare;
    }

    public void setProgramare(Programare programare) {
        this.programare = programare;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString(){
        return "Id: "+this.id+"\n"+
                "Doctor Id: "+this.doctorId+"\n"+
                "Pacient Id: "+this.pacientId+"\n"+ this.programare+"\n";
    }

    @Override
    public  boolean equals(Object object){

        Agenda agenda=(Agenda) object;

        return this.programare.equals(agenda.getProgramare());
    }

    @Override
    public int compareTo(Agenda agenda){

        return this.getProgramare().compareTo(agenda.programare);
    }
}
