package com.example.Bahnhof_Ferienprojekt.models;
import java.util.Date;


public class Buchung {
    int id;
    String passagier;
    int passagierId;
    String zuglinie;
    int zuglinieId;
    int buchungsnummer;
    //In Euro
    int preis;
    Date buchungsdatum;
    //ArrayList für ausgewählte Bahnhöfe!

    //CONSTRUCTOR
    public Buchung(int id, int buchungsnummer, String zuglinie, int zuglinieId, String passagier, int passagierId, int preis, Date buchungsdatum){
        setId(id);
        setBuchungsnummer(buchungsnummer);
        setZuglinie(zuglinie);
        setZuglinieId(zuglinieId);
        setPassagier(passagier);
        setPassagierId(passagierId);
        setPreis(preis);
        setBuchungsdatum(buchungsdatum);
    }

    //Setter & Getter
    public void setBuchungsnummer(int buchungsnummer) {
        this.buchungsnummer = buchungsnummer;
    }
    public void setBuchungsdatum(Date buchungsdatum) {
        this.buchungsdatum = buchungsdatum;
    }
    public void setPassagier(String passagier) {
        this.passagier = passagier;
    }
    public void setPassagierId(int passagierId) {
        this.passagierId = passagierId;
    }
    public void setZuglinie(String zuglinie) {
        this.zuglinie = zuglinie;
    }
    public void setZuglinieId(int zuglinieId) {
        this.zuglinieId = zuglinieId;
    }
    public void setPreis(int preis) {
        this.preis = preis;
    }
    public int getBuchungsnummer() {
        return buchungsnummer;
    }
    public Date getBuchungsdatum() {
        return buchungsdatum;
    }
    public int getPreis() {
        return preis;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getPassagier() {
        return passagier;
    }
    public int getPassagierId() {
        return passagierId;
    }
    public String getZuglinie() {
        return zuglinie;
    }
    public int getZuglinieId() {
        return zuglinieId;
    }


}
