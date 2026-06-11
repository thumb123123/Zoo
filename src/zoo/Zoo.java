package zoo;

import java.util.Scanner;

public class Zoo {
    
    public static void main(String[] args) {
        Bestellungsliste liste = new Bestellungsliste();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("-- Automatisierte Zoo Bestellung --");
        
        while (true) {
            System.out.println("Hauptmenue:");
            System.out.println("[1] Neue Bestellung erstellen");
            System.out.println("[2] Uebersicht / Bestellungen anschauen");
            System.out.println("[3] Programm beenden");
            System.out.print("Ihre Auswahl: ");
            
            String auswahl = scanner.nextLine();
            
            if (auswahl.equals("1")) {
                liste.addBestellung();
            } else if (auswahl.equals("2")) {
                liste.zeigeUebersicht();
            } else if (auswahl.equals("3")) {
                System.out.println("Vielen Dank fuer die Nutzung des Zoo-Bestellsystems. Tschuess!");
                break;
            } else {
                System.out.println("Ungueltige Eingabe, bitte waehlen Sie 1, 2 oder 3.");
            }
        }
        scanner.close();
    }
}