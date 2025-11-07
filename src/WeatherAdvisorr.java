public class WeatherAdvisorr {
    public static void main(String[] args) {
        // Reto fizzbuzz, si el numero es multiplo de 3 se imprime Fizz, si es multipli
        // de 5 imprime Buzz si es multiplo de ambos entonces FizzBuzz
        // Si no es ningun caso imprime el numero, es decir un else despues de las
        // condiciones
        for (int i = 0; i < 100; i++) {
            
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }

        }
    }
}