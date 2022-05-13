package com.example.Bahnhof_Ferienprojekt.models;

public class HochgeschwindigkeitsZug extends Zug {
    //VARIABLENDEKLARATION
    //In Euro
    int entwicklungskosten;

    //CONSTRUCTOR
    public HochgeschwindigkeitsZug(int id, String modell, String betreiber, int durchschnittsgeschwindigkeit, int wagonanzahl, String zulassungsdatum, int entwicklungskosten){
        super(id, modell, betreiber, durchschnittsgeschwindigkeit, wagonanzahl, zulassungsdatum);
        setEntwicklungskosten(entwicklungskosten);
    }

    //Setter und Getter
    public void setEntwicklungskosten(int entwicklungskosten) {
        this.entwicklungskosten = entwicklungskosten;
    }
    public int getEntwicklungskosten() {
        return entwicklungskosten;
    }
}
