public class For_Break_Continue {
    public static void main(String[] args){
        System.out.println("Break Statement ");
        for(int i=1 ;  i<=7 ; i++){

            if(i==4){
                break;

            }
            System.out.println(i);

        }
        System.out.println("Continue Statement ");
        for(int i=1; i<=10; i++){
            if(i==5 ){
                continue;
            }
            System.out.println(i);
        }
    }
}
