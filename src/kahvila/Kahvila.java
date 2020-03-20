package kahvila;

import java.util.ArrayList;
import java.util.List;

public class Kahvila {
    // Tuotteiden tallennus
    public List<Tuote> tuotteet;


    public Kahvila() {
        this.tuotteet = new ArrayList<>();
    }



    //tuotteiden lisäys
    public void LisaaTuote(Tuote c) {
        tuotteet.add(c);
    }
    public List<Tuote> getTuotteet() {
        return tuotteet;
    }
// Tuotteen poisto
        public void poistaTuote(String a) {
        int index = -1;
        for (Tuote tuote: tuotteet) {
            if(tuote.getNimi().equals(a)) {
                index = tuotteet.indexOf(tuote);
            }
        }
    }










}
