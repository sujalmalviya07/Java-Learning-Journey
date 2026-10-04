public class Gcd_Recursive {

    static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static void main(String[] args){
        int x= gcd(12,16);
        System.out.println(x);
    }
}
