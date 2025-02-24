public abstract class Salariat extends Persoana {
    private String idAngajat;
    private int baseSalariu;
    private int ziuaSalariu; // ziua de salariu in fiecare luna
//    public Salariat(int baseSalariu, int ziuaSalariu) {
//        super("123", "testNume", "testPrenume", "testDomiciliu");
//        this.baseSalariu = baseSalariu;
//        if (ziuaSalariu > 31 || ziuaSalariu < 1) {
//            throw new IllegalArgumentException("ziuaSalariu should be between 1 and 31");
//        }
//        this.ziuaSalariu = ziuaSalariu;
//    }
    public String getIdAngajat() {
        return idAngajat;
    }
    public void setSalariu(int baseSalariu) {
        this.baseSalariu = baseSalariu;
    }
    public void setSalariu(int baseSalariu, int ziuaSalariu) {
        if (ziuaSalariu > 31 || ziuaSalariu < 1) {
            throw new IllegalArgumentException("ziuaSalariu should be between 1 and 31");
        }
        this.ziuaSalariu = ziuaSalariu;
        this.baseSalariu = baseSalariu;
    }
    public int getBaseSalariu() {
        return baseSalariu;
    }
}
