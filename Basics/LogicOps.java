public class LogicOps {
    public static void main(String[] args){
        int a = 8,
            b = 5;
        
        //Relational equality operator
        System.out.println("is a equal to b? -> " + (a==b));
        System.out.println("is a different to b? -> " + (a!=b));

        //Relational comparison operators
        System.out.println("is a greater than b? -> " + (a>b));
        System.out.println("is a less than to b? -> " + (a<b));

        if (a==b){
            System.out.println("a is equal to b");
        } else{
            System.out.println("a is different to b");
        }

        if (a>b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is less than b");
        }
    }
}
