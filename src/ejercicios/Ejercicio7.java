package ejercicios;

public class Ejercicio7 {
    public static void main(String[] args) {
        int base = 5;
        int altura = 8;
        double area = calcularArea(base, altura);
        System.out.println("El área del triángulo es: " + area);
        System.out.println("Derbis Velazco");
    }
    public static double calcularArea(int base, int altura) {
        // Aplicar la fórmula del área del triángulo
        return (base * altura) / 2.0;  // Usamos 2.0 para asegurarnos de que la división sea en punto flotante
    }
}
