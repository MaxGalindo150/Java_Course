import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        int response;
        
        do {
            System.out.println("Select the number of rhe desired option:");
            System.out.println("1.- Movies");
            System.out.println("2.- Series");
            System.out.println("3.- Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 3:
                    System.out.println("Thanks for visiting us");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Select a correct option");
            }
        } while (response != 3);

        System.out.println("The program ended");

    }
}
