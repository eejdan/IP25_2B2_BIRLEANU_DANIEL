import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Spital spitalulMeu = Spital.getInstance();
        try {
            spitalulMeu.createDoctor("Popescu", "Alex", "UAIC 2", "123", 1000, 21);
            spitalulMeu.createPacient("Birleanu", "Jan", "Str. Floreasca 3", "333", new Date());

            spitalulMeu.assignDoctorPacient("333", "123");
            spitalulMeu.setPacientDiagnostic("333", "Diabet");

            System.out.println("Diagnostic Pacient 333:" + spitalulMeu.getPacientDiagnostic("333"));

            System.out.println("Salariu Doctor 123:" + spitalulMeu.getDoctorSalary("123"));
            spitalulMeu.setDoctorBaseSalariu("123", 3000);
            System.out.println("Salariu Doctor 123:" + spitalulMeu.getDoctorSalary("123"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}