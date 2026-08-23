import java.util.Scanner;

public class AreaOfTriangle {
  public   static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Triangle Area Calculator :\n");

      System.out.print("Enter the base of triangle : ");
      int base = sc.nextInt();

      System.out.print("Enter the height of triangle : ");
      int height = sc.nextInt();

      int area = (base*height)/2;
      System.out.println("Area of Triagnle is : " + area);

    }
}
