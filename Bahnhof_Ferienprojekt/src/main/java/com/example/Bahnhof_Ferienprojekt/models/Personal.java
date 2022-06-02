package com.example.Bahnhof_Ferienprojekt.models;



//Subklasse von Oberklasse Person
public class Personal extends Person{
    //VARIABLENDEKLARATION
    int personalnummer;
    String personaltyp;

    //CONSTRUCTOR
    public Personal(int id, String vorname, String nachname, int personalnummer, String personaltyp){
        super(id, vorname, nachname);
        setPersonalnummer(personalnummer);
        setPersonaltyp(personaltyp);
    }

    // Setter und Getter
    public int getPersonalnummer() {
        return personalnummer;
        
    }

    public void setPersonalnummer(int personalnummer) {
        this.personalnummer = personalnummer;
    }

    public String getPersonaltyp() {
        return personaltyp;
    }

    public void setPersonaltyp(String personaltyp) {
        this.personaltyp = personaltyp;
    }

}
