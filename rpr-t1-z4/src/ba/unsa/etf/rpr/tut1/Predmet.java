package ba.unsa.etf.rpr.tut1;

public class Predmet {
    private Student[] nizStudenata=null;
    private String imePredmeta;
    private int sifraPredmeta;
    private final int MAX_BROJ_STUDENATA;
    private int brojStudenata;

    public Predmet(String imePredmeta,int sifraPredmeta, int maxBroj){
        this.imePredmeta=imePredmeta;
        this.sifraPredmeta=sifraPredmeta;
        MAX_BROJ_STUDENATA=maxBroj;
        brojStudenata=0;
        nizStudenata=new Student[MAX_BROJ_STUDENATA];
    }

    public int getSifraPredmeta() {
        return sifraPredmeta;
    }
    public String getImePredmeta() {
        return imePredmeta;
    }
    public Student[] getNizStudenata() {
        return nizStudenata;
    }
    public void setImePredmeta(String imePredmeta) {
        this.imePredmeta = imePredmeta;
    }
    public void setSifraPredmeta(int sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }
    public void setNizStudenata(Student[] nizStudenata) {
        this.nizStudenata = nizStudenata;
    }

    public void upisi(Student s) throws Exception{
        if(brojStudenata >= MAX_BROJ_STUDENATA){
            throw new Exception("Dostignut maksimalan broj studenata");
        }
        nizStudenata[brojStudenata++]=s;
    }

    public void ispisi(Student s){
        for(int i = 0; i < brojStudenata; i++){
            if(s.equals(nizStudenata[i])){
                for(int j=i;j<brojStudenata-1;j++){
                    nizStudenata[j]=nizStudenata[j+1];
                }
                brojStudenata--;
            }
        }
    }
    public void ispisiStudente(){
        for(int i = 0; i < brojStudenata; i++){
            System.out.print(i + 1 + ". ");
            nizStudenata[i].ispisiStudenta();
        }
    }

}
