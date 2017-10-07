package jteszt01;

public class Jteszt01 {

    public Jteszt01() {
        kutyak();
    }

    void kutyak() {
        Kutya kutyaBloki = new Kutya("Blöki");
        kutyaBloki.suly = 20;
        kutyaBloki.szin = "barna";

        Kutya kutyaBodri = new Kutya("Bodri");
        kutyaBodri.suly = 18;
        kutyaBodri.szin = "fekete";
        
        Kutya kutyaFrakk = new Kutya(17, "fehér", "Frakk");

        System.out.println(kutyaBloki);    
    }

    public static void main(String[] args) {
        new Jteszt01();
    }

}
