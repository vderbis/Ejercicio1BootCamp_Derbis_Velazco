package ejercicios;

public class Ejercicio9 {
    public static void main(String[] args) {
        int N = 50;
        int suma = calcularSuma(N);
        System.out.println("La suma de los primeros " + N + " números naturales es: " + suma);
        System.out.println("Derbis Velazco");
    }
    public static int calcularSuma(int N) {
        // Aplicar la fórmula para la suma de los primeros N números naturales
        return N * (N + 1) / 2;
    }
}
