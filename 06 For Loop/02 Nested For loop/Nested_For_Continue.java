public class Nested_For_Continue {
    public static void main(String[] args){
        for(int i =1; i<=5; i++){
            for(int j=1; j<=7 ; j++){
                if(j==3 || j==5){
                    continue;
                }
                System.out.println(i + " "+ j);
            }
        }
    }
}
