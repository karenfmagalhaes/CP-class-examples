package griffith;
import java.util.Scanner;
public class TemperatureCF {

        public static void main(String [] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("The temperature in Celsius is ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsius*(9.0/5.0) + 32;
            System.out.println(celsius +"°C = " + fahrenheit+ "°F");

            scanner.close();
        }
    }
