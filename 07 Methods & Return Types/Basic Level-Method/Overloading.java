public class Overloading {

    static void print(int number){
        System.out.println(number);
    }

    static void print(double number){
        System.out.println(number);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static void show(int a) {
        System.out.println("Integer: " + a);
    }

    static void show(String a) {
        System.out.println("String: " + a);
    }


    static void test(int a, double b) {
        System.out.println("int then double");
    }

    static void test(double a, int b) {
        System.out.println("double then int");
    }




    public static void main(String[] args){
            print(9.3);

            int x = add(3,2,11);
            System.out.println(x);

           show("sujal");

            test(10, 20.5);


    }
}
