public class PrimeNumber_Method {

    static boolean primeNumber(int n){

        if(n<=1){
            return false;
        }
        for(int i=2; i<n ; i++){

            if(n%i==0){
                return false;
            }


        }
           return true;
    }

    static int countPrime(int n){
        int count=0;

        for(int i=1; i<=n;i++){

            if(primeNumber(i)){
                count++;
            }


        }
        return count;

    }

    public static void main(String[] args){
        boolean x = primeNumber(19);
        System.out.println(x);

        int y= countPrime(10);
        System.out.println(y);
    }
}
