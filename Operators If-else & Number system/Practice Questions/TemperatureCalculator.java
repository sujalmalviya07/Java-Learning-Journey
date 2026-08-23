import java.util.Scanner;

public class TemperatureCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("  ####### Temperature Calculator ######## ");
        System.out.println("-------Convert Fahrenheit to Celsius------ ");

        System.out.print("Enter Your Temperature in Fahrenheit : ");
        float tem = sc.nextFloat();

        float temperature = (tem-32)*5/9;


        System.out.println("Temperature in Celsius : " + temperature);

    }
}
