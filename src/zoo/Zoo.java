package zoo;

public class Zoo {

    public static void main(String[] args) {
        // Testcode
        Bestellung erste = new Bestellung();
        // Beispielperson
        Person Bob = new Person(10, 1); // Alter, Auftagsnummer
        Bob.bereiche.get(1).besucht = true;
        erste.Personhinzufügen(Bob);
        
        erste.Parkplatz = true;
        
        System.out.println(erste.getPreis());
        

    }
    
}
