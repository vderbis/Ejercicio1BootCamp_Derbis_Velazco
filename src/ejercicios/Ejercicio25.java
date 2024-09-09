package ejercicios;

public class Ejercicio25 {
    public static void main(String[] args) {
        int numero = 7;
        generarTablaDeMultiplicar(numero);
    }
    public static void generarTablaDeMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        System.out.println("Derbis Velazco");
    }
}
