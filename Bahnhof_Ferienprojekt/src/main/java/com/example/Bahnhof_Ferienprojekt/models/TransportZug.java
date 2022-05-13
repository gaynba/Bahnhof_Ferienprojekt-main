package com.example.Bahnhof_Ferienprojekt.models;

import java.util.Date;

public class TransportZug extends Zug{
    //VARIABLENDEKLARATION
    String langstreckenzulassung;
    String umweltbelastung;
    //In KG
    int maxgesamtgewichtinkg;

    //CONSTRUCTOR
    public TransportZug(int id, String modell, String betreiber, int durchschnittsgeschwindigkeit, int wagonanzahl, Date zulassungsdatum, String langstreckenzulassung, String umweltbelastung, int maxgesamtgewichtinkg){
        super(id, modell, betreiber, durchschnittsgeschwindigkeit, wagonanzahl, zulassungsdatum);
        setLangstreckenzulassung(langstreckenzulassung);
        setMaxgesamtgewichtinkg(maxgesamtgewichtinkg);
        setUmweltbelastung(umweltbelastung);
    }

    //Setter und Getter
    public void setLangstreckenzulassung(String langstreckenzulassung) {
        this.langstreckenzulassung = langstreckenzulassung;
    }
    public void setMaxgesamtgewichtinkg(int maxgesamtgewichtinkg) {
        this.maxgesamtgewichtinkg = maxgesamtgewichtinkg;
    }
    public void setUmweltbelastung(String umweltbelastung) {
        this.umweltbelastung = umweltbelastung;
    }
    public String getLangstreckenzulassung(){
        return langstreckenzulassung;
    }
    public int getMaxgesamtgewichtinkg() {
        return maxgesamtgewichtinkg;
    }
    public String getUmweltbelastung() {
        return umweltbelastung;
    }
}
