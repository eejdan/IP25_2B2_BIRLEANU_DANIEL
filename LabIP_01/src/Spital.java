import java.util.Date;

public class Spital {
    private static Spital instance = null;
    private Spital() {};

    public static Spital getInstance() {
        if (instance == null) {
            instance = new Spital();
        }
        return instance;
    }

    private Doctor[] doctors = new Doctor[10];
    private int doctorsCount = 0;
    private Pacient[] pacients = new Pacient[10];
    private int pacientsCount = 0;

    public void createDoctor(String nume, String prenume, String domiciliu, String cnp, int baseSalariu, int ziuaSalariu) throws Exception {
        if(doctorsCount > 9) {
            throw new Exception("Prea multi doctori");
        }
        int indexDoc = doctorsCount;
        doctors[indexDoc] = new Doctor(nume, prenume, domiciliu, cnp, baseSalariu, ziuaSalariu);
        doctorsCount++;
    }
    public void createPacient(String nume, String prenume, String domiciliu, String cnp, Date ziInternare) throws Exception {
        if(pacientsCount > 9) {
            throw new Exception("Prea multi pacienti");
        }
        int indexPac = pacientsCount;
        pacients[indexPac] = new Pacient(nume, prenume, domiciliu, cnp, ziInternare);
        pacientsCount++;
    }
    public void setPacientDiagnostic(String cnp, String diagnostic) throws Exception {
        for(int i = 0; i < pacientsCount; i++) {
            if(pacients[i].cnp.equals(cnp)) {
                pacients[i].changeDiagnostic(diagnostic);
                return;
            }
        }
        throw new Exception("Pacient not found");
    }
    public String getPacientDiagnostic(String cnp) throws Exception{
        for(int i = 0; i < pacientsCount; i++) {
            if(pacients[i].cnp.equals(cnp)) {
                return pacients[i].diagnostic;
            }
        }
        throw new Exception("Pacient not found");
    }
    public String assignDoctorPacient(String cnpPacient, String cnpDoctor) throws Exception {
        Boolean foundDoctor = false;
        for(int i = 0; i < doctorsCount; i++) {
            if(doctors[i].cnp.equals(cnpDoctor)) {
                foundDoctor = true; break;
            }
        }
        if(!foundDoctor) { throw new Exception("Doctor not found"); }
        for(int i = 0; i < pacientsCount; i++) {
            if(pacients[i].cnp.equals(cnpPacient)) {
                return pacients[i].diagnostic;
            }
        }
        throw new Exception("Pacient not found");
    }
    public void setDoctorBaseSalariu(String cnp, int baseSalariu) throws Exception {
        for(int i = 0; i < doctorsCount; i++) {
            if(doctors[i].cnp.equals(cnp)) {
                doctors[i].setSalariu(baseSalariu);
                return;
            }
        }
        throw new Exception("Doctor not found");
    }

    public int getDoctorSalary(String cnp) throws Exception {
        for(int i = 0; i < doctorsCount; i++) {
            if(doctors[i].cnp.equals(cnp)) {
                return doctors[i].getBaseSalariu();
            }
        }
        throw new Exception("Doctor not found");
    }
}
