public class Arrays {
    public static void main(String[] args){
        String[] androidVersions = new String[17]; //one-dimension array

        String weekDays[] = new String[7]; //one-dimension array

        String[][] cities = new String[4][2]; //two-dimension array

        int[][][] numbers = new int[3][3][3]; //three-dimension array

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellín";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "CDMX";

        /*for (int i=0; i<androidVersions.length; i++){
            System.out.println(androidVersions[i]);
        }

        System.out.println();


        for (int i=0; i<cities.length; i++){
            for (int j=0; j<cities[i].length; j++){
                System.out.println(cities[i][j]);
            }
        }*/

        for (String androidVersion : androidVersions) {
            System.out.print(androidVersion + "\n");
        }

        System.out.println();

        for (String[] pair : cities) {
            for (String city : pair) {
                System.out.println(city + "\n");
            }
        }

    }
    
}
