public class UpdatingVariables{
    public static void main(String[] arg){
        int salary = 1000;

        //bonus $200
        salary = salary + 200;

        //pension $50
        salary = salary - 50;

        //extra hours $30 p/h
        //food $45

        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //updating strings
        String employeeName = "Max Galindo";
        employeeName = employeeName + " Hernandez";

        System.out.println(employeeName);
    }
}