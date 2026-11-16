

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSupermarkt
{
    @Test
    public void test_setZuWenigKassen(){
        Supermarkt s;
        s = new Supermarkt("ABC",0, false);
        //Fehler
        assertEquals(1, s.getKassen());
    }
    @Test
    public void test_setPassendeKassen(){
        Supermarkt s;
        s = new Supermarkt("ABC",3, false);
        //kein fehler
        assertEquals(2, s.getKassen());
    }
    @Test
    public void test_setZuVieleKassen(){
        Supermarkt s;
        s = new Supermarkt("ABC",102, false);
        //Fehler
        assertEquals(100, s.getKassen());
    }
    
}
