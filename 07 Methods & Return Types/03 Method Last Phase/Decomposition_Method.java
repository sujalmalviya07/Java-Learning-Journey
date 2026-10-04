public class Decomposition_Method {

    static int  sumOfDivisors(int  n ){
        int sum=0;
        for(int i=1 ; i<=n ; i++){
            if(n%i==0){

                sum+=i;
            }

        }
        return sum;
    }
    static boolean isPerfectNumber(int n){
        return n==sumOfDivisors(n);
    }

    static int countPerfectNumbers(int n){
        int count=0;
        for(int i=1 ; i<n;i++){
            if (isPerfectNumber(i)) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args){

        int y = countPerfectNumbers(10);
        System.out.println(y);
    }

}
