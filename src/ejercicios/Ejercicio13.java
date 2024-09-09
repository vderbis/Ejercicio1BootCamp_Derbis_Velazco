package ejercicios;
public class Ejercicio13 {
    public static void main(String[] args) {
        int a = 1221;
        int original = a;
        int invertido = 0;
        // Invertir el número
        while (a != 0) {
            int digito = a % 10;
            invertido = invertido * 10 + digito;
            a /= 10;
        }
        // Verificar si el número es igual a su versión invertida
        if (original == invertido) {
            System.out.println("El número es un palíndromo.");
        } else {
            System.out.println("El número no es un palíndromo.");
        }
        System.out.println("Derbis Velazco");
    }
}
