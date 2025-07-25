public class Patient {
    //Atributos
    int id;
    private String name;
    String email;
    String address;
    String phoneNumber;
    private String birthday;
    private String blood;
    double weight;
    private double height;

    public Patient(String name, String email){
        System.out.println("Bienvenido " + name);
        this.name = name;
        this.email = email;
    }

}
