public class EvenSum_Method {

    static int evenSum(int n){
        int sum=0;
        for(int i = 2; i<=n ; i+=2){

            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args){
       int x = evenSum(10);
        System.out.println(x);
    }
}

