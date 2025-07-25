public class Doctor {
    //Atributos
    static int id=0;
    String name;
    String speciality;

    public Doctor (){
        this.name ="Nombre por defecto";
        this.speciality = "Especialidad or defecto";
    }

    public Doctor(String name, String speciality) {
        System.out.println("El nombre del Doctor asignado es: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
}
