public class WhileLoop {

    static boolean isTurnOnlight = false;
    public static void main(String[] args){

        turnOnOffLight();

        int i=1;

        while (isTurnOnlight && i<=10){
            printSOS();
            i++;
        }

    }
    
    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLight(){
        isTurnOnlight = (isTurnOnlight)?false:true;
        return isTurnOnlight;
    }
}
