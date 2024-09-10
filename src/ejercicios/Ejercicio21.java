package ejercicios;
public class Ejercicio21 {
    /*
    Calcula la raíz cuadrada del número a = 49
    sin usar funciones predefinidas.
    La raíz cuadrada de 49 es 7.
    */
    public static void main(String[] args) {
        System.out.println(raizCuadrada(49));
    }
    public static int raizCuadrada (int numero) {
        if (numero < 0) {
            throw new ArithmeticException("La raíz cuadrada no está definida para números negativos.");
        }
        if (numero == 0 || numero == 1) {
            return numero;
        }
        int a = 0;
        int b = numero;
        int mitad;
        while (a <= numero) {
            mitad  = (a + b) >> 1;
            if (numero / mitad < mitad) {
                b = mitad - 1;
            } else {
                if (numero / (mitad + 1) <= mitad) {
                    return mitad;
                }
                a = mitad + 1;
            }
        }
        return a;
    }
}
