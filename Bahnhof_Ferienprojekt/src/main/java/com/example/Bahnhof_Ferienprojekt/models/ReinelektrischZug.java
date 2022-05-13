package com.example.Bahnhof_Ferienprojekt.models;

public class ReinelektrischZug extends Zug{
    //VARIABLENDEKLARATION
    //z.B. Wechselstrom, Gleichstrom etc.
    String energieversorgung;
    int batterielebensdauerinjahren;

    //CONSTRUCTOR
    public ReinelektrischZug(int id, String modell, String betreiber, int durchschnittsgeschwindigkeit, int wagonanzahl, String zulassungsdatum, String energieversorgung, int batterielebensdauerinjahren){
        super(id, modell, betreiber, durchschnittsgeschwindigkeit, wagonanzahl, zulassungsdatum);
        setBatterielebensdauerinjahren(batterielebensdauerinjahren);
        setEnergieversorgung(energieversorgung);
    }

    //Setter & Getter
    public void setBatterielebensdauerinjahren(int batterielebensdauerinjahren) {
        this.batterielebensdauerinjahren = batterielebensdauerinjahren;
    }
    public void setEnergieversorgung(String energieversorgung) {
        this.energieversorgung = energieversorgung;
    }
    public int getBatterielebensdauerinjahren() {
        return batterielebensdauerinjahren;
    }
    public String getEnergieversorgung() {
        return energieversorgung;
    }
}
