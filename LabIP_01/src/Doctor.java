public class Doctor extends Salariat {

    public Doctor(int baseSalariu, int ziuaSalariu) {
        setSalariu(baseSalariu, ziuaSalariu);
    }
    public Doctor(String nume, String prenume, String domiciliu, String cnp, int baseSalariu, int ziuaSalariu) {
        setSalariu(baseSalariu, ziuaSalariu);
        this.nume = nume;
        this.prenume = prenume;
        this.domiciliu = domiciliu;
        this.cnp = cnp;
    }

}
