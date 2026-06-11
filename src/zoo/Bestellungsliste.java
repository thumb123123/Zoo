package zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Bestellungsliste {
     public ArrayList<Bestellung> Liste = new ArrayList<>();
     Scanner scanner = new Scanner(System.in);
     
     public void addBestellung(){
         Bestellung B = new Bestellung();
         Liste.add(B);
     }
     
     public void zeigeUebersicht() {
         if (Liste.isEmpty()) {
             System.out.println("Es liegen noch keine Bestellungen vor!");
             return;
         }
         
         System.out.println("\n=== VERFUEGBARE BESTELLUNGEN ===");
         for (int i = 0; i < Liste.size(); i++) {
             System.out.println((i + 1) + ". Bestellung (" + Liste.get(i).PersonListe.size() + " Personen)");
         }
         
         System.out.println("Welche Bestellung wollen Sie detailliert ansehen? (Nummer eingeben):");
         int auswahl = scanner.nextInt();
         scanner.nextLine(); 
         
         if (auswahl < 1 || auswahl > Liste.size()) {
             System.out.println("Ungueltige Auswahl!");
             return;
         }
         
         // Die gewählte Bestellung herausholen
         Bestellung b = Liste.get(auswahl - 1);
         System.out.println("\n=================================");
         System.out.println("   DETAILS FUER BESTELLUNG M-0" + auswahl);
         System.out.println("=================================");
         
         // Jede Person einzeln aufschlüsseln
         for (int i = 0; i < b.PersonListe.size(); i++) {
             Person p = b.PersonListe.get(i);
             System.out.println("Person #" + (i+1) + " (Alter: " + p.alter + ")");
             System.out.println("-> Strichcode/Auftragsnummer: [" + p.auftragsnummer + "]");
             System.out.print("-> Gebuchte Bereiche: ");
             
             boolean hatBereiche = false;
             for (Bereich ber : p.bereiche) {
                 if (ber.isBesucht()) {
                     System.out.print(ber.getName() + " ");
                     hatBereiche = true;
                 }
             }
             if(!hatBereiche) System.out.print("Keine");
             
             System.out.println("\n-> Kosten fuer diese Person: " + p.getEinzelPreis(b.KindAlter) + " Euro");
             System.out.println("---------------------------------");
         }
         
         // Parkplatz & Endsumme
         System.out.println("Parkplatz gebucht: " + (b.Parkplatz ? "Ja (" + b.Parkplatzpreis + " Euro)" : "Nein"));
         System.out.println("---------------------------------");
         System.out.println("GESAMTPREIS DER BESTELLUNG: " + b.getPreis() + " Euro");
         System.out.println("=================================\n");
     }
}