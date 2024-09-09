package ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c = 9;
        int mayor = encontrarMayor(a, b, c);
        System.out.println("El mayor de los números es: " + mayor);
        System.out.println("Derbis Velazco");
    }
    public static int encontrarMayor(int a, int b, int c) {
        int mayor = a;  // Supongamos inicialmente que 'a' es el mayor
        if (b > mayor) {
            mayor = b;  // Si 'b' es mayor que 'mayor', actualiza 'mayor'
        }
        if (c > mayor) {
            mayor = c;  // Si 'c' es mayor que 'mayor', actualiza 'mayor'
        }
        return mayor;
    }
}

