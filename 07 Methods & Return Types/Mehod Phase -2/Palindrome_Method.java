public class Palindrome_Method {

     static boolean palindrome(int n){
        int orignal=n;
        int digit=0;

        while (n>0){

            digit=digit*10+n%10;
            n/=10;
        }
       return orignal==digit;


    }

    public static void main(String[] args){
         boolean x = palindrome(1221);
         boolean y = palindrome(12212);
        System.out.println(x);
        System.out.println(y);
    }
}
