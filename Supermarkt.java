
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
    
    public String getStadt(){
        int pos = name.indexOf("-");
        return name.substring(0, pos);
    }
    
    public String getSupermarktName(){
        int pos = name.indexOf("-");
        return name.substring(pos+1, name.length());
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
        if(kassen>=1&&kassen<=100){
            this.kassen=kassen;
        } else {
            System.out.print("Kassen müssen zwischen 0 und 100 sein.");
            this.kassen=1;
        }
    }
    
    public void setParkplatz(boolean parkplatz){
        this.parkplatz=parkplatz;
    }
    
    public void printSupermarkt(){
        System.out.println("Supermarktname: "+name+", Kassen: "+kassen+", Parkplaetze: "+parkplatz);
    }
}