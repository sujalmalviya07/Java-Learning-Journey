public class ParameterMethod {

    static int cube(int a ){
        return a*a*a;
    }

    static int multiply(int a,int b){
        return a*b;
    }


    public static void main(String[] args){
        int x = cube(3);
        int y = cube(9);
        System.out.println("Cube by Method");
        System.out.println(x);
        System.out.println(y);

        System.out.println("\nMultiply Method calling ");
        int value=multiply(9,4);
        System.out.println(value);

    }


}
