package ejercicios;
public class Ejercicio24 {
    public static void main(String[] args) {
        int numero = 3;
        int rangoInferior = 1;
        int rangoSuperior = 50;

        int suma = sumarMultiplos(numero, rangoInferior, rangoSuperior);
        System.out.println("La suma de todos los múltiplos de " + numero + " en el rango de " + rangoInferior + " a " + rangoSuperior + " es: " + suma);
        System.out.println("Derbis Velazco");
    }
    public static int sumarMultiplos(int numero, int rangoInferior, int rangoSuperior) {
        int suma = 0;
        for (int i = rangoInferior; i <= rangoSuperior; i++) {
            if (i % numero == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
