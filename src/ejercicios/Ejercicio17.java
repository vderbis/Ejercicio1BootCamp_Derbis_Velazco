package ejercicios;

public class Ejercicio17 {
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        int suma = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {  // Verifica si el número es par
                suma += i;    // Suma el número par y lo almacena en la variable suma
            }
        }
        System.out.println("La suma de los números pares entre " + a + " y " + b + " es: " + suma);
        System.out.println("Derbis Velazco");
    }
}
