import javax.xml.namespace.QName;
public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor( "Jane Doe", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient currentpatient = new Patient("Juanita Perez", "example@email.com");
        currentpatient.weight = 60.6;

    }
}