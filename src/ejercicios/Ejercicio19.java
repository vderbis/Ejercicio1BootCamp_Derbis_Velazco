package ejercicios;
public class Ejercicio19 {
    public static void main(String[] args) {
        int numero = 28;
        if (esNumeroPerfecto(numero)) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }
        System.out.println("Derbis Velazco");
    }
    public static boolean esNumeroPerfecto(int numero) {
        int sumaDivisores = 0;
        // Encuentra los divisores propios del número
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        // Verifica si la suma de los divisores es igual al número
        return sumaDivisores == numero;
    }
}
