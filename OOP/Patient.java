package OOP;

public class Patient {
    //Atributtes
    int id; 
    private String name,
                   email,
                   address,
                   phoneNumber,
                   birthday,
                   blood;
    private double weight,
                   height;

    //Constructor
    Patient(String name, String email){
        this.name = name;
        this.email = email;
    }

    //Methods
   
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return "Patient: " + this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String newPhoneNumber) {
        if (newPhoneNumber.length() != 10){
            System.out.print("Please, type a ten digits phone number");
        }else{
            this.phoneNumber = newPhoneNumber;
        }
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return this.blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getWeight() {
        return this.weight + " kg";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return this.height + " m";
    }

    public void setHeight(double height) {
        this.height = height;
    }
    

    

    
}
