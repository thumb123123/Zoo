package zoo;

public class Bereich {
    String name;
    int preisErwachsen;
    int preisKind;
    boolean besucht;
    
    public Bereich(String name, int preisErwachsen, int preisKind) {
        this.name = name;
        this.preisErwachsen = preisErwachsen;
        this.preisKind = preisKind;
        this.besucht = false;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPreisErwachsen() {
        return preisErwachsen;
    }
    
    public int getPreisKind() {
        return preisKind;
    }
    
    public boolean isBesucht() {
        return besucht;
    }
    
    public void setBesucht(boolean besucht) {
        this.besucht = besucht;
    }
}
