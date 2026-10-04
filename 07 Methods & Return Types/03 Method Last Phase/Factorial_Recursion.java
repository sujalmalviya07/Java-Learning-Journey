public class Factorial_Recursion {

    static int factorial(int n){

        if(n==1){
            return 1;

        }

        return  n*factorial(n-1);
    }

    static void main(String[] args) {
       int x= factorial(5);
        System.out.println(x);
    }
}
