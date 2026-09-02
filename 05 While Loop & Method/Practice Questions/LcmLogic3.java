import java.util.Scanner;

public class LcmLogic3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number ");
        int first = sc.nextInt();
        System.out.println("Enter Second Number ");
        int second = sc.nextInt();

        int i=1;
        int multiple=0;
        int multiple2=0;
        while (true){
            multiple=first*i;
            int j=1;

            while (true){
                multiple2=second*j;

                if(multiple%second==0&&multiple2%first==0){
                    System.out.println("LCM is " + multiple);
                    return;
                }
                if(multiple2>multiple){
                    break;
                }
                j++;
            }
            i++;

        }



    }
}
