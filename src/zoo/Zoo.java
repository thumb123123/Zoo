package zoo;

public class Zoo {

    public static void main(String[] args) {
        // Testcode
        Bestellung erste = new Bestellung();
        // Beispielperson
        Person Bob = new Person(70, 1); // Alter, Auftagsnummer
        
        erste.Personhinzufügen(Bob);
        
        erste.Parkplatz = true;
        
        System.out.println(erste.getPreis());
        System.out.println("Ende");
        

    }
    
}
