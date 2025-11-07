import java.util.Scanner;

public class WeatherAdvisorr2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el inicio del rango: ");
        int inicio = scanner.nextInt();
        System.out.print("Ingrese el fin del rango: ");
        int fin = scanner.nextInt();

        for (int i = inicio; i <= fin; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
