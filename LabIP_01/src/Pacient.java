import java.util.Date;

public class Pacient extends Persoana {
    public Date ziInternare;
    public String diagnostic;
    public Doctor doctorAsignat;
    public Pacient(String nume, String prenume, String domiciliu, String cnp, Date ziInternare) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.domiciliu = domiciliu;
        this.cnp = cnp;
        diagnostic = "";
        doctorAsignat = null;
        this.ziInternare = ziInternare;
    }
    public void changeDiagnostic(String newDiagnostic) {
        diagnostic = newDiagnostic;
    }
 }
