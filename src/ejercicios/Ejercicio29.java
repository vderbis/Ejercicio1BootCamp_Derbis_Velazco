package ejercicios;

public class Ejercicio29 {
    /*
    Determina si el número a = 64 es un cuadrado perfecto.
    Un cuadrado perfecto es un número que es el resultado de multiplicar un entero
    por sí mismo. En este caso, 8 × 8 = 64.
    */
    public static void main(String[] args) {
        double a= 64;
        double b = Math.sqrt(a); //raiz cuadrada... b = raiz cuadrada de a (64)
        double c = b*b;          // c = b por b (8x8)
        if(c==a){                //comparo si son iguales C = A?? --> (8x8) = 64
            System.out.println(a + "  Es cuadrado perfecto");
            System.out.println("Derbis Velazco");
        } else {
            System.out.println(a + "  No es cuadrado perfecto");
            System.out.println("Derbis Velazco");
        }
    }
}
