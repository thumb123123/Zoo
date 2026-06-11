package zoo;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Ben
 */
public class Bestellungsliste {
     public ArrayList<Bestellung> Liste = new ArrayList<>();
     
     public void addBestellung(){
         Bestellung B = new Bestellung();
         Liste.add(B);
     }
     
     public Bestellung getBestellung(int index){
         return this.Liste.get(index);
     }
    
    
}
