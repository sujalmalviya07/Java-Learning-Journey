public class SumOfDigit_Method {

    static int sumDigit(int n){
        int digit=0;
        while(0<n){

             digit= digit+n%10;
               n/=10;
        }
        return  digit;

    }
    public static void main(String[] args){

        int x= sumDigit(1234);
        System.out.println(x);
    }
}
