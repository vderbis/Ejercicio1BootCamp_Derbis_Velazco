package ejercicios;

public class Ejercicio11 {
    public static void main(String[] args) {
        int N = 10;
        imprimirFibonacci(N);
    }
    public static void imprimirFibonacci(int N) {
        // Variables para almacenar los dos últimos números de la secuencia
        int a = 0;
        int b = 1;
        // Imprimir los primeros N números de la secuencia de Fibonacci
        for (int i = 0; i < N; i++) {
            System.out.print(a + " ");
            // Calcular el siguiente número de la secuencia
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println("Derbis Velazco");
    }
}
