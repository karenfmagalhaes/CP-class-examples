package griffith;
import java.util.Scanner;
public class TemperatureFC {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("The temperature in Fahrenheit is ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit-32)/(9.0/5.0);
        System.out.println(fahrenheit +"°F = " + celsius+ "°C");

        scanner.close();
    }
}
