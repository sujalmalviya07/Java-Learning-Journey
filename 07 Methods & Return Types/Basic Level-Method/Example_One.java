public class Example_One {
    public static void main(String[] args){

    int z  = calculate(5,2);

    }

    public static int calculate(int a , int b){
       int resultOne =a+b;
       int resultFour =a-b;
       int resultTwo =a*b;
       int resultThree =a/b;
        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println(resultThree);
        System.out.println(resultFour);

        return  resultOne;
    }
}
