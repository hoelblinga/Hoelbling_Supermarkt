
/**
 * Write a description of class Supermarkt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Supermarkt
{
    
    private String name;               
    private int kassen;
    private boolean parkplatz;
    
    
    public Supermarkt(){
        setName("UNKN");
        setKassen(0);
        setParkplatz(false);
    }
    
    public Supermarkt(String name, int kassen, boolean parkplatz){
        setName(name);
        setKassen(kassen);
        setParkplatz(parkplatz);
    }
    
    public String getName(){
        return name;
    }
    public int getKassen(){
        return kassen;
    }
    public boolean getParkplatz(){
        return parkplatz;
    }
    
    
    public void setName(String name){
        this.name=name;
    }
    public void setKassen(int kassen){
        this.kassen=kassen;
    }
    public void setParkplatz(boolean parkplatz){
        this.parkplatz=parkplatz;
    }
    
    public void printSupermarkt(){
        System.out.println("Supermarktname: "+name+", Kassen: "+kassen+", Parkplaetze: "+parkplatz);
    }
}