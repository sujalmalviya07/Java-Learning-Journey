public class Direct_Method {

    static int cube(int n){
        return n*n*n;
    }
     static int plusTen(int n){
        return cube(n)+10;
     }


    public static void main(String[] args){
        int x = plusTen(10);
        System.out.println(x);
    }

}

