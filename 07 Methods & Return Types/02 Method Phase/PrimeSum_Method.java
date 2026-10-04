public class PrimeSum_Method {

    static boolean primeNumber(int n){

        if(n<=1){
            return false;
        }
        for(int i=2; i<n; i++){

            if(n%i==0){
                return false;
            }

        }
        return true;

    }

    static int sumPrime(int n){

        int sum = 0;

        for(int i=1;i<=n;i++) {

            if (primeNumber(i)) {
                sum += i;
            }
        }
        return sum;

    }

    public static void main(String[] args){
      int x= sumPrime(10);

        System.out.println(x);
    }
}
