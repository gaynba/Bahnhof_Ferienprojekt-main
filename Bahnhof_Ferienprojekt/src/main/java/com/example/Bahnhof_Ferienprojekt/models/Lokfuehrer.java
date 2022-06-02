package com.example.Bahnhof_Ferienprojekt.models;

import java.util.ArrayList;
import java.util.Date;


public class Lokfuehrer extends Person{

    //VARIABLENDEKLARATION
    int lokfuehrernummer;
    //Mehrere Qualifikationen möglich!
    ArrayList<String> qualifikation = new ArrayList<String>();
    Date fuehrerzulassung;

    //Constructor
    public Lokfuehrer(int id, String vorname, String nachname, int lokfuehrernummer, ArrayList<String> qualifikation, Date fuehrerzulassung){
        super(id, vorname, nachname);

    }

    // Setter und Getter
    public Date getFuehrerzulassung() {
        return fuehrerzulassung;
    }

    public void setLokfuehrernummer(int lokfuehrernummer) {
        this.lokfuehrernummer = lokfuehrernummer;
    }

    public ArrayList<String> getQualifikation() {
        return qualifikation;
    }

    public void setFuehrerzulassung(Date fuehrerzulassung) {
        this.fuehrerzulassung = fuehrerzulassung;
    }

    public void setQualifikation(ArrayList<String> qualifikation) {
        this.qualifikation = qualifikation;
    }

    public int getLokfuehrernummer() {
        return lokfuehrernummer;
    }


}
