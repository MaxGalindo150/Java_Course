public class Functions {
    public static void main(String[] args) {
        System.out.println(convertToPesos(200, "EUR"));        
    }
    
    public static double circleArea(double r){
        return Math.PI*Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4*Math.PI*Math.pow(r,2);
    }

    public static double circleVolume(double r){
        return (3/4)*Math.PI*Math.pow(r,3);
    }


    /**
     * Description: Function that by specifying its currency converts an amount of money into Pesos MXN
     * @param quantity Amount of money
     * @param currency Type of currency: "EUR", "USD"
     * @return quantity: Returns the amount of money expressed in MXN
    */
    public static double convertToPesos(double quantity, String currency){
        switch (currency){
            case "USD":
                quantity = quantity*18.15;
                break;
            case "EUR":
                quantity = quantity*19.81;
                break;
            /*default:
                System.out.println("Please select \"USD\" or \"EUR\"");*/
        }
        return quantity; 
    }
}
