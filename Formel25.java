public class Formel25{
    //z = x*x + y*y - x;
    public int berechne(int x, int y){
        int z=x*x + y*y - x;
        return z;
    }
    
    //e = berechne(a, 2) + berechne(b, 3) + berechne(c, a);
    public int berechne(int a, int b, int c){
        int e = berechne(a, 2) + berechne(b, 3) + berechne(c, a);
        return e;
    }
}