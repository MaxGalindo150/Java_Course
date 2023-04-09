package OOP;
import static OOP.ui.UIMenu.*;


public class Main {
    public static void main(String[] args){

        Doctor myDoctorMax = new Doctor("Maximiliano Galindo", "Surgeon");
        myDoctorMax.showName();

        Patient myPatientNat = new Patient("Natalia", "natalia@gmail.com");
        myPatientNat.setWeight(59);
        System.out.println(myPatientNat.getWeight());
        // showMenu();

    }

    }
    

