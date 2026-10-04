public class Composition_Method {

    static int  sumOfDivisors(int  n ){
        int sum=0;
        for(int i=1 ; i<n ; i++){
            if(n%i==0){

                sum+=i;
            }

        }
        return sum;
    }
    static boolean perfectNumber(int n){
        return n==sumOfDivisors(n);
    }

    public static void main(String[] args){
        int x=sumOfDivisors(28);
        System.out.println(x);
        boolean y = perfectNumber(6);
        System.out.println(y);
    }

}
