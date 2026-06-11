/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;
import java.util.ArrayList;

/**
 *
 * @author Ben
 */
public class Bestellung {
    public ArrayList<Person> PersonListe = new ArrayList<>();
    public boolean Parkplatz;
    public int Parkplatzpreis = 5; // Preis in €
    public int KindAlter = 17;
    // Konstruktor
    public Bestellung(){
        
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
