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

}