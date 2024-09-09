package ejercicios;

public class Ejercicio27 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Antes del intercambio: a = " + a + ", b = " + b);
        // Intercambiar los valores sin usar una tercera variable
        a = a + b; // a ahora es 15 (5 + 10)
        System.out.println("Luego de sumar el valor de a + b = a vale = " + a );
        b = a - b; // b ahora es 5 (15 - 10)
        System.out.println("Luego de restar el valor a - b = b vale = " + b );
        a = a - b; // a ahora es 10 (15 - 5)
        System.out.println("Luego de restar el valor de a - b = a vale = " + a );
        System.out.println("Después del intercambio: a = " + a + ", b = " + b);
        System.out.println("Derbis Velazco");
    }
}
