public class Right_aligned {
    public static void main(String[] args){
        System.out.println(" Right-aligned Pattern printing incrementing order ");

        for(int i=4; i>=1;i--){
            for(int space=1 ;space<i;space++){
                System.out.print(" "+ " ");

            }
           for(int j=4;j>=i;j--){
               System.out.print("*" +" ");
           }
            System.out.println();
        }

    }
}
