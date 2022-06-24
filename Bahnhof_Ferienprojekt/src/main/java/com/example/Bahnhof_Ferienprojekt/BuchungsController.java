//IMPORTS
package com.example.Bahnhof_Ferienprojekt;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.Bahnhof_Ferienprojekt.models.Bahnhof;
import com.example.Bahnhof_Ferienprojekt.models.Buchung;
import com.example.Bahnhof_Ferienprojekt.models.Passagier;
import com.example.Bahnhof_Ferienprojekt.models.Zuglinie;
import java.util.Date;
import java.util.ArrayList;

@Controller
public class BuchungsController {
    //ArrayList-Deklaration
    ArrayList<Passagier> passagiere;
    ArrayList<Zuglinie> zuglinien;
    ArrayList<Buchung> buchungen;
    ArrayList<Bahnhof> bahnhoefe;

    public BuchungsController(){
        setPassagiere(passagiere);
        setZuglinien(zuglinien);
        setBahnhoefe(bahnhoefe);
        setBuchungen(buchungen);

        loadPassagiereFromDB();
        loadBahnhoefeFromDB();
        //loadZuglinieFromDB();


    }




    // Laden der Klassen aus der Datenbank
    private void loadPassagiereFromDB() {
        DBController db = new DBController();
        setPassagiere(db.getAllPassagiere());
    }

    private void loadBahnhoefeFromDB() {
        DBController db = new DBController();
        setBahnhoefe(db.getAllBahnhoefe());
    }


    // @GetMapping("/Buchung")
    // public String buchungen(@RequestParam(name="id", required = true, defaultValue = "null") int id, @RequestParam(name= ))





    // Setter und Getter
    public ArrayList<Passagier> getPassagiere() {
        return passagiere;
    }

    public void setPassagiere(ArrayList<Passagier> passagiere) {
        this.passagiere = passagiere;
    }

    public ArrayList<Zuglinie> getZuglinien() {
        return zuglinien;
    }

    public void setZuglinien(ArrayList<Zuglinie> zuglinien) {
        this.zuglinien = zuglinien;
    }

    public ArrayList<Bahnhof> getBahnhoefe() {
        return bahnhoefe;
    }

    public void setBahnhoefe(ArrayList<Bahnhof> bahnhoefe) {
        this.bahnhoefe = bahnhoefe;
    }

    public ArrayList<Buchung> getBuchungen() {
        return buchungen;
    }

    public void setBuchungen(ArrayList<Buchung> buchungen) {
        this.buchungen = buchungen;
    }
}