package ejercicios;

public class Ejercicio12 {
    public static void main(String[] args) {
        int a = 54321;
        int invertido = 0;
        while (a != 0) {
            int digito = a % 10;
            invertido = invertido * 10 + digito;
            a /= 10;
        }
        System.out.println("El número invertido es: " + invertido);
        System.out.println("Derbis Velazco");
    }
}
