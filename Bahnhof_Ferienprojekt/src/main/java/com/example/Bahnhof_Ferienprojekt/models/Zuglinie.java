package com.example.Bahnhof_Ferienprojekt.models;
import java.sql.Date;
import java.util.ArrayList;


public class Zuglinie {
    //VARIABLENDEKLARATION
    String lokfuehrer;
    int lokfuehrerId;
    ArrayList<Personal> personal = new ArrayList<Personal>();
    ArrayList<Bahnhof> bahnhof = new ArrayList<Bahnhof>();
    Zug zug;
    int zugliniennummer;
    Date fahrtdatum;

    //CONSTRUCTOR
    public Zuglinie(int zugliniennummer, Zug zug, String lokfuehrer,int lokfuehrerId, ArrayList<Personal> personal, ArrayList<Bahnhof> bahnhof, Date fahrtdatum){
        setLokfuehrer(lokfuehrer);
        setPersonal(personal);
        setZug(zug);
        setZugliniennummer(zugliniennummer);
        setFahrtDatum(fahrtdatum);
        setBahnhof(bahnhof);
    }

    //Setter und Getter
    public void setLokfuehrer(String lokfuehrer) {
        this.lokfuehrer = lokfuehrer;
    }
    public void setLokfuehrerId(int lokfuehrerId) {
        this.lokfuehrerId = lokfuehrerId;
    }
    public void setPersonal(ArrayList<Personal> personal) {
        this.personal = personal;
    }
    public void setBahnhof(ArrayList<Bahnhof> bahnhof) {
        this.bahnhof = bahnhof;
    }
    public void setZug(Zug zug) {
        this.zug = zug;
    }
    public void setFahrtDatum(Date fahrtdatum) {
        this.fahrtdatum = fahrtdatum;
    }
    public void setZugliniennummer(int zugliniennummer) {
        this.zugliniennummer = zugliniennummer;
    }
    public String getLokfuehrer() {
        return lokfuehrer;
    }
    public int getLokfuehrerId() {
        return lokfuehrerId;
    }
    public ArrayList<Bahnhof> getBahnhof() {
        return bahnhof;
    }
    public ArrayList<Personal> getPersonal() {
        return personal;
    }
    public Zug getZug() {
        return zug;
    }
    public Date getFahrtDatum() {
        return fahrtdatum;
    }
    public int getZugliniennummer() {
        return zugliniennummer;
    }


}
   
