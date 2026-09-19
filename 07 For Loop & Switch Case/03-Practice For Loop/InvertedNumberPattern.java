public class InvertedNumberPattern {
    public static void main(String[] args){
        int count=1;
        for(int i=1; i<=4;i++){
            for(int space=1;space<=4-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(count +" ");
                count++;
            }
            System.out.println();
        }
        count--;

        for(int i=1;i<=4;i++){
            for(int space=1;space<i;space++){
                System.out.print(" ");
            }
            for (int j=4;j>=i;j--){
                System.out.print(count+" ");
                count--;
            }
            System.out.println();
        }
    }
}