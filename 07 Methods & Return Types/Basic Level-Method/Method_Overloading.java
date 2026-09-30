public class Method_Overloading {
    public static void main(String[] args){
        int x=myNumber(2,3);
        int y=myNumber(12,3,11);
        System.out.println(x);
        System.out.println(y);
    }

    public static int myNumber(int a , int b ){
       return a+b;

    }
    public static int myNumber(int a , int b , int c ){
        return a+b+c;
    }
}


