public class Method_Calling_Method {

    static int square(int n){
        return  n*n;
    }
    static int squarePlusFive(int n){
        int x = square(n);
        return x+5;
    }

    public static void main(String[] args){
        int ans = squarePlusFive(5);
        System.out.println(ans);
    }
}
