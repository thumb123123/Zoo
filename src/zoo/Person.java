package zoo;

import java.util.ArrayList;
import java.util.List;

public class Person {

    public ArrayList<Bereich> bereiche = new ArrayList<>();

    {
        bereiche.add(new Bereich("Eurasien", 5, 2));
        bereiche.add(new Bereich("Afrika", 10, 5));
        bereiche.add(new Bereich("Nordamerika", 15, 7));
        bereiche.add(new Bereich("Südamerika", 20, 10));
        bereiche.add(new Bereich("AustralienUndOzeanien", 25, 12));
        bereiche.add(new Bereich("TropischesZentrum", 30, 15));
        bereiche.add(new Bereich("Meereswelt", 35, 17));

    }
    int alter, auftragsnummer;

    public Person() {
    }
}
