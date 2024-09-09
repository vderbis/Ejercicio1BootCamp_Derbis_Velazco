package ejercicios;

public class Ejercicio8 {
    public static void main(String[] args) {
        int celsius = 25;
        double fahrenheit = convertirACelsiusAFahrenheit(celsius);
        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");
        System.out.println("Derbis Velazco");
    }
    public static double convertirACelsiusAFahrenheit(int celsius) {
        // Aplicar la fórmula de conversión
        return (celsius * 9.0 / 5.0) + 32;
    }
}
