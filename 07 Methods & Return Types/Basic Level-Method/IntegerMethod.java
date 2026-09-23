public class IntegerMethod {

    static int square(){
       int a=5;
       int b=a*a;
       return b;
    }

    static int cupe(){
        int a=5;
        return a*a*a;
    }

    static int print(){
        System.out.println("Hello World");
        return 90;
    }
    public static void main(String[] args){
        System.out.println(square());
        int x=cupe();
        System.out.println(x);
        int y=print();
    }

}
