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
