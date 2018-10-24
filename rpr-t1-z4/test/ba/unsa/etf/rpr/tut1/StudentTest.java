package ba.unsa.etf.rpr.tut1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void ispisiStudenta() {
        Student s=new Student("Dzan","Tabakovic",18044);
        assertEquals("Tabakovic Dzan (18044)",s.toString());
    }

    @Test
    void setIme() {
        Student s = new Student("Dzan", "Tabakovic", 18044);
        s.setIme("Amar");
        assertEquals("Amar", s.getIme());
    }
}