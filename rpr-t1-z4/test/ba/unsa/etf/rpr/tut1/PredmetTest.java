package ba.unsa.etf.rpr.tut1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void dostignutMaxBrojStudenata() {

        assertThrows(Exception.class,()->{
            Predmet p = new Predmet("IM", 125, 2);
            Student s1=new Student("Amra","Dadic",18215);
            Student s2=new Student ("Nadja","Sokolovic",18000);
            Student s3=new Student ("Bakir","Sabljica",18111);
            p.upisi(s1);
            p.upisi(s2);
            p.upisi(s3);
        });
    }

    @Test
    void upisIspis(){
        assertDoesNotThrow(() -> {
            Predmet k = new Predmet("LAG", 225, 3);
            Student k1=new Student("Amra","Dadic",18215);
            Student k2=new Student ("Nadja","Sokolovic",18000);
            Student k3=new Student ("Bakir","Sabljica",18111);
            k.upisi(k1);
            k.upisi(k2);
            k.upisi(k3);
            Student k4=new Student("Dzan","Tabakovic", 18005);
            k.ispisi(k2);
            k.upisi(k4);
        });

    }

    @Test
    void brojStudenata() throws Exception{
        Predmet k = new Predmet("LAG", 225, 3);
        Student k1=new Student("Amra","Dadic",18215);
        Student k2=new Student ("Nadja","Sokolovic",18000);
        k.upisi(k2);
        k.upisi(k1);
        k.ispisi(k1);
        k.ispisi(k2);
        assertEquals(0,k.getBrojStudenata());
    }

}