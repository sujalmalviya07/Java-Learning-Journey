import java.util.Scanner;

public class LeatCommonDivision {
    public static int readNumber(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number: ");
        return sc.nextInt();

    }
    public static void main(String[] args){

                                                        // Logic 1 -> By Multiple Of Number

        int num1 = readNumber();
        int num2 = readNumber();

        int i = 1;
        while (true){
            int multiple1 = num1*i;
            int j=1;

            while (true){
                int multiple2 = num2*j;

                if(multiple1==multiple2){
                    System.out.println("LCM is : "+multiple1);
                    return;
                }
                if(multiple2>multiple1){
                    break;
                }
                j++;
            }
            i++;
        }



    }


}


