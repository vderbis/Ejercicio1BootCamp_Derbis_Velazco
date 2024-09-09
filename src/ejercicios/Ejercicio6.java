package ejercicios;

public class Ejercicio6 {
    public static void main(String[] args) {
        int a = 4;
        int b = 9;
        int c = 13;
        double promedio = calcularPromedio(a, b, c);
        System.out.println("El promedio de los números es: " + promedio);
        System.out.println("Derbis Velazco");
    }
    public static double calcularPromedio(int a, int b, int c) {
        // Suma de los tres números
        int suma = a + b + c;
        // Calcular el promedio dividiendo la suma entre 3
        return suma / 3.0;  // Usamos 3.0 para asegurar que la división sea en punto flotante
    }
}

