package ejercicios;

public class Ejercicio16 {
    public static void main(String[] args) {
        int a = 5678;
        int suma = 0;
        // Sumar los dígitos
        while (a != 0) {
            suma += a % 10;
            a /= 10;
        }
        System.out.println("La suma de los dígitos es: " + suma);
        System.out.println("Derbis Velazco");
    }
}
