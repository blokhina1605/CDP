package decorator;


public class Clinic {
    public static void main(String[] args) {
        Specialty doctor = new Surgeon(new Vet(new Surgeon(new Dantist(new Doctor()))));
        System.out.println(doctor.treat());
    }
}
