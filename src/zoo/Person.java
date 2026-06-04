package zoo;

import java.util.ArrayList;

public class Person {

    public static ArrayList<String> bereiche = new ArrayList<>();
    public static ArrayList<Boolean> BooleanList = new ArrayList<>();
    public static ArrayList<Integer> PreisErwachsen = new ArrayList<>();
    public static ArrayList<Integer> PreisKind = new ArrayList<>();

    static {
        bereiche.add("Eurasien");
        bereiche.add("Afrika");
        bereiche.add("Nordamerika");
        bereiche.add("Südamerika");
        bereiche.add("AustralienUndOzeanien");
        bereiche.add("TropischesZentrum");
        bereiche.add("Meereswelt");

        BooleanList.add(false);
        BooleanList.add(false);
        BooleanList.add(false);
        BooleanList.add(false);
        BooleanList.add(false);
        BooleanList.add(false);
        BooleanList.add(false);

        PreisErwachsen.add(5);
        PreisErwachsen.add(10);
        PreisErwachsen.add(15);
        PreisErwachsen.add(20);
        PreisErwachsen.add(25);
        PreisErwachsen.add(30);
        PreisErwachsen.add(35);

        PreisKind.add(2);
        PreisKind.add(5);
        PreisKind.add(7);
        PreisKind.add(10);
        PreisKind.add(12);
        PreisKind.add(15);
        PreisKind.add(17);

    }
    int alter, auftragsnummer;

    public Person(int alter, int auftragsnummer) {
        this.alter = alter;
        this.auftragsnummer = auftragsnummer;
    }
}
