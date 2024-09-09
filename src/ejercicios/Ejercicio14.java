package ejercicios;

public class Ejercicio14 {
    public static void main(String[] args) {
        int a = 45;
        String binario = "";
        while (a > 0) {
            binario = (a % 2) + binario;
            a /= 2;
        }
        System.out.println("El número en binario es: " + binario);
        System.out.println("Derbis Velazco");
    }
}
