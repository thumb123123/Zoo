package zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Bestellung {
    Scanner scanner = new Scanner(System.in);
    public ArrayList<Person> PersonListe = new ArrayList<>();
    public boolean Parkplatz;
    public int Parkplatzpreis = 5; 
    public int KindAlter = 17;
    
    // Counter für die fortlaufende Auftragsnummer aller Personen in dieser Bestellung
    private static int globalAuftragsCounter = 1000; 

    public Bestellung(){
        int i = 1;
        while(true){
            Person p = new Person();
            
            System.out.println("\n--- Person " + i + " ---");
            System.out.println("Wie alt ist die Person?");
            int alter = scanner.nextInt();
            scanner.nextLine(); // Scanner-Bug abfangen
            
            // WICHTIG: Alter im Objekt speichern!
            p.alter = alter;
            
            // Bereiche abfragen
            for(int j = 0; j < p.bereiche.size(); j++){
                int preis = 0;
                if(alter > this.KindAlter){
                    preis = p.bereiche.get(j).getPreisErwachsen();
                } else {
                    preis = p.bereiche.get(j).getPreisKind();
                }
                
                System.out.println("Wollen Sie den Bereich " + p.bereiche.get(j).getName() + " fuer " + preis + " Euro buchen? (y/n)");
                if(scanner.nextLine().equalsIgnoreCase("y")){
                    p.bereiche.get(j).setBesucht(true);
                }
            }
            
            // Eindeutige Auftragsnummer für die Person vergeben
            p.auftragsnummer = globalAuftragsCounter++;
            Personhinzufügen(p);
            
            System.out.println("Wollen Sie eine weitere Person zu DIESER Bestellung hinzufuegen? (y/n)");
            if(!scanner.nextLine().equalsIgnoreCase("y")){
                break;
            }
            i++;
        }
        
        // Nach den Personen: Parkplatz abfragen
        System.out.println("Benoetigen Sie fuer diese Bestellung einen Parkplatz (einmalig " + Parkplatzpreis + " Euro)? (y/n)");
        if(scanner.nextLine().equalsIgnoreCase("y")) {
            this.Parkplatz = true;
        } else {
            this.Parkplatz = false;
        }
        
        System.out.println("-> Bestellung erfolgreich aufgenommen!\n");
    }
    
    public void Personhinzufügen(Person Kunde){
        PersonListe.add(Kunde);
    }
    
    // Gesamtpreis der Bestellung berechnen
    public int getPreis(){
        int preis = 0;
        for(Person p : PersonListe){
            preis += p.getEinzelPreis(this.KindAlter);
        }
        if(this.Parkplatz){
            preis += this.Parkplatzpreis;
        }
        return preis;
    }
}