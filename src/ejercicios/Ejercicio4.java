package ejercicios;

import java.security.PublicKey;

public class Ejercicio4 {
     /*
     * Números Primos
     * a = 29
     * Descripción: Dado el número a = 29, determina si es primo. Un número primo solo tiene dos divisores: 1 y él mismo.
     */
     public static void main(String[] args) {
         int numero = 29; // Puedes cambiar este número para probar otros
         boolean esPrimo = esNumeroPrimo(numero);
         if (esPrimo) {
             System.out.println(numero + " es un número primo.");
         } else {
             System.out.println(numero + " no es un número primo.");
         }
         System.out.println("Derbis Velazco");
     }
    public static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
     }
}

