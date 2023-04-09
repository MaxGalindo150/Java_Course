package OOP;

import java.sql.Date;
import java.util.ArrayList;

public class Doctor {
    
    //Atributtes
    static int id = 0; //Autoincrement
    private String name,
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

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add( new Doctor.AvailableAppointment(date, time))
    }
    
    public ArrayList<AvailableAppointment> getAvailableAppointments({
        return availableAppointments;
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return this.id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
           return this.date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return this.time;
        }

        public void setTime(String time) {
            this.time = time;
        }


        
        
        

    }
}
