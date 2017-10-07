package jteszt01;


public class Kutya {
   public int suly;
   public String szin;
   private String nev;

    public Kutya(String nev) {
        this.nev = nev;
    }

    public Kutya(int suly, String szin, String nev) {
        this.suly = suly;
        this.szin = szin;
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }

    @Override
    public String toString() {
        return "Az én nevem: " + nev ;
    }
   
   
}
