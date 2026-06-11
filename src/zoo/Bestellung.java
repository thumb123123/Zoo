/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class Bestellung {
    Scanner scanner = new Scanner(System.in);
    public ArrayList<Person> PersonListe = new ArrayList<>();
    public boolean Parkplatz;
    public int Parkplatzpreis = 5; // Preis in €
    public int KindAlter = 17;
    // Konstruktor
    public Bestellung(){
        int i = 0;
        while(true){
            Person p = new Person();
            // Abfrage von daten
            System.out.println("wie alt ist die Person?");
            int alter = scanner.nextInt();
            scanner.skip("/");
            
           
            
            for(int j = 0; j < p.bereiche.size(); j++){
                int preis = 0;
                if(alter>this.KindAlter){
                    preis =  p.bereiche.get(j).getPreisErwachsen();
                }else{
                    preis = p.bereiche.get(j).getPreisKind();
                }
                System.out.println("Wollen sie den Bereich " + p.bereiche.get(j).getName() + " fuer " + preis + " euro buchen? y/n");
                if(scanner.nextLine().equals("y")){
                    p.bereiche.get(j).besucht= true;
                }
                
            }
            p.auftragsnummer = i;
            Personhinzufügen(p);
            System.out.println("Wollen sie eine Person hinzufuegen? y/n");
            if(!scanner.nextLine().equals("y")){
                    break;
                }
            
            
            
        }
        
    }
    
    public void Personhinzufügen(Person Kunde){
        PersonListe.add(Kunde);
    }
    
    public int getPreis(){
        int preis=0;
        for(int i = 0; i < PersonListe.size(); i++){
            Person Person = this.PersonListe.get(i);
            int alter = Person.alter;
            for(int j = 0; j < Person.bereiche.size(); j++){
                if(Person.bereiche.get(j).isBesucht()==true){
                    if(alter>KindAlter){
                        preis += Person.bereiche.get(j).getPreisErwachsen();
                    }else{
                        preis += Person.bereiche.get(j).getPreisKind();
                    }
                }
            }
        }

        // Parkplatz
        if(this.Parkplatz==true){
            preis += this.Parkplatzpreis;
        }
        return preis;
    }
    
    
    
}
