public class NatureOfNumber_Method {
    static boolean isPrime(int n){

            if(n<=1){
                return false;
            }

            for (int i=2 ; i<n;i++){

                if(n%i==0){
                    return false;
                }


            }
            return true;


    }
    public static void main(String[] args){
        boolean x= isPrime(15);
        boolean y= isPrime(11);
        boolean z = isPrime(1);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
