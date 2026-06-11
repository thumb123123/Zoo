package zoo;

import java.util.ArrayList;

public class Person {

    public ArrayList<Bereich> bereiche = new ArrayList<>();
    public int alter;
    public int auftragsnummer;

    {
        bereiche.add(new Bereich("Eurasien", 5, 2));
        bereiche.add(new Bereich("Afrika", 10, 5));
        bereiche.add(new Bereich("Nordamerika", 15, 7));
        bereiche.add(new Bereich("Südamerika", 20, 10));
        bereiche.add(new Bereich("AustralienUndOzeanien", 25, 12));
        bereiche.add(new Bereich("TropischesZentrum", 30, 15));
        bereiche.add(new Bereich("Meereswelt", 35, 17));
    }

    public Person() {
        // Standardkonstruktor
    }

    // Berechnet den Preis NUR für diese einzelne Person
    public int getEinzelPreis(int kindAlter) {
        int preis = 0;
        for (Bereich b : bereiche) {
            if (b.isBesucht()) {
                if (this.alter > kindAlter) {
                    preis += b.getPreisErwachsen();
                } else {
                    preis += b.getPreisKind();
                }
            }
        }
        return preis;
    }
}