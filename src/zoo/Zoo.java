package zoo;

import java.util.Scanner;

public class Zoo {
    
    public static void main(String[] args) {
        // inizierungen
        Bestellungsliste Liste = new Bestellungsliste();
        Scanner scanner = new Scanner(System.in);
        
        
        
        System.out.println("--Automatisierte Zoo Bestellung--");
        System.out.println("wollen sie eine bestellung hinzufuegen? y/n");
        if(scanner.nextLine().equals("y")){
        Liste.addBestellung();
            
            
        }
    }
}
