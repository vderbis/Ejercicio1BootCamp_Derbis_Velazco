package ejercicios;
public class Ejercicio23 {
    public static void main(String[] args) {
        int numero = 45;
        verificarDivisibilidad(numero);
    }
    public static void verificarDivisibilidad(int numero) {
        // Verificar si es divisible por 2
        if (numero % 2 == 0) {
            System.out.println(numero + " es divisible por 2.");
        } else {
            System.out.println(numero + " no es divisible por 2.");
        }
        // Verificar si es divisible por 3
        if (numero % 3 == 0) {
            System.out.println(numero + " es divisible por 3.");
        } else {
            System.out.println(numero + " no es divisible por 3.");
        }
        // Verificar si es divisible por 5
        if (numero % 5 == 0) {
            System.out.println(numero + " es divisible por 5.");
        } else {
            System.out.println(numero + " no es divisible por 5.");
        }
        System.out.println("Derbis Velazco");
    }
}
