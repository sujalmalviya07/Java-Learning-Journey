public class EvenOdd_Method {

    static boolean isEven(int num){
        if(num%2==0){
            System.out.println("Number is Even ");
            return true;
        }
        else {
            System.out.println("Number is odd");
            return false;
        }
    }
    public static void main(String[] args){

        boolean x=isEven(8);
        boolean y=isEven(17);
        System.out.println(x);
    }
}
