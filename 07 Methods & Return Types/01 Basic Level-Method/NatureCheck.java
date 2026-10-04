public class NatureCheck {

    static boolean isPositive(int n){
        return n>0;
    }

    public static void main(String[] args){
        boolean x = isPositive(40);
        boolean y = isPositive(0);
        boolean z = isPositive(-33);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

}
