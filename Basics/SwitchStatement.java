public class SwitchStatement {
    public static void main(String[] args){
        
        String colorModeSelected = "Dark";

        switch (colorModeSelected){
            case "Light":
                System.out.println("You selected Light Mode");
                break;
            case "Night":
                System.out.println("You selected Night Mode");
                break;
            case "Blue Dark":
                System.out.println("You selected Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("You selected Dark Mode");
                break;
            default:
                System.out.println("Select one opcion");
        }
    }
}
