package ejercicios;

public class Ejercicio10 {
    public static void main(String[] args) {
        int a = 6;
        long factorial = calcularFactorial(a);
        System.out.println("El factorial de " + a + " es: " + factorial);
        System.out.println("Derbis Velazco");
    }
    public static long calcularFactorial(int n) {
        long resultado = 1;
        // Multiplicar todos los números desde 1 hasta n
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
