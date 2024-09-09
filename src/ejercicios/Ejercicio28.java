package ejercicios;

public class Ejercicio28 {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        int mcd = calcularMCD(a, b);
        System.out.println("El MCD de " + a + " y " + b + " es: " + mcd);
        System.out.println("Derbis Velazco");
    }
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
