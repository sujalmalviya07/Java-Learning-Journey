public class Method_Overloading {
    public static void main(String[] args){
        int x=myNumber(2,3);
        int y=myNumber(12,3,11);
        System.out.println(x);
        System.out.println(y);
    }

    public static int myNumber(int a , int b ){
       return a+b;

    }
    public static int myNumber(int a , int b , int c ){
        return a+b+c;
    }




}

/*

static void show(int a, double b) {
}                                        No method Overloading bcz ---->

static void show(int x, double y) {
}



✅ Number of parameters different
✅ Parameter data types different
✅ Parameter types ka order different
❌ Sirf parameter names different → not overloading
❌ Sirf return type different → not overloading



 */


