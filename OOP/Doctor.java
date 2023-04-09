package OOP;

public class Doctor {
    
    //Atributtes
    static int id = 0; //Autoincrement
    String name,
           email,
           speciality;

    Doctor(String name, String speciality){
        this.name = name;
        this.speciality = speciality;

        id++; //When a new doctor is created id increments its value
    }

    //Methods
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
    
}
