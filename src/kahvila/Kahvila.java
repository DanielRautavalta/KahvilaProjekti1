package kahvila;

import java.util.ArrayList;
import java.util.List;

public class Kahvila {
    public List<Tuote> tuotteet;


    public Kahvila() {
        this.tuotteet = new ArrayList<>();
    }


    public void LisaaTuote(Tuote c) {
        tuotteet.add(c);
    }


    public void poistaTuote(int a) {
        tuotteet.remove(a);
    }


    public int getIndex(String poisto) {
        return tuotteet.indexOf(poisto);
    }


    public int suuri() {
        return tuotteet.size();
    }







}
