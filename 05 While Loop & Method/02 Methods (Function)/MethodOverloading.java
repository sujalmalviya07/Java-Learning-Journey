public class MethodOverloading {
   public static int add(int a, int b) {
        return  a+b;

    }
  public static int add(int a ,int b , String name   ){
        return a+b;
    }
    public static void main(String[] args){

       int sum = add(12,23);
       int result = add(30,30,"Sujal");  // The Return Type is int, So the String cannot be printed
        System.out.println(sum);
        System.out.println(result);

    }
}