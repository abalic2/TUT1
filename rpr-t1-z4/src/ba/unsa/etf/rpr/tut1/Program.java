package ba.unsa.etf.rpr.tut1;

public class Program {
    public static void main(String[] args) {
        Student s = new Student("azra", "balic",18051);
        s.setIme("Azra");
        Student s2 = new Student("Bakir", "Sabljica", 18045);
        Predmet p = new Predmet("IM", 125, 5);
        try {
            p.upisi(s);
            p.upisi(s2);
            p.ispisiStudente();
            p.ispisi(s);
            p.ispisiStudente();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
