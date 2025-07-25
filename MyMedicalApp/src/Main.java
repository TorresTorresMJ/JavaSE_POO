import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Rodriguez";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        //Doctor.id++; Afectando el identificador desde otra clase

        Doctor MyDoctorAnn = new Doctor();
        myDoctor.showId();
        System.out.println(Doctor.id);

        showMenu();
    }
}