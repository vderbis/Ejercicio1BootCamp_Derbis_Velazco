package ejercicios;

public class Ejercicio22 {
    public static void main(String[] args) {
        int numero = 987654;
        int cantidadDigitos = contarDigitos(numero);
        System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");
        System.out.println("Derbis Velazco");
    }
    public static int contarDigitos(int numero) {
        // Convertir el número a cadena para contar los dígitos
        String numeroStr = Integer.toString(numero);
        return numeroStr.length();
    }
}
