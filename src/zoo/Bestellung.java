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
    public ArrayList<Person> PersonListe = new ArrayList<Person>();
    public boolean Parkplatz;
    // Konstruktor
    public Bestellung(){
        
    }
    
    public void Personhinzufügen(Person Kunde){
        PersonListe.add(Kunde);
    }
    
    
    
}
