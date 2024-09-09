package ejercicios;
public class Ejercicio20 {
    public static void main(String[] args) {
        int numero = 153;
        if (esNumeroArmstrong(numero)) {
            System.out.println(numero + " es un número Armstrong.");
        } else {
            System.out.println(numero + " no es un número Armstrong.");
        }
        System.out.println("Derbis Velazco");
    }
    public static boolean esNumeroArmstrong(int numero) {
        // Convertir el número a cadena para contar los dígitos y procesar cada dígito
        String numeroStr = Integer.toString(numero);
        int numDigitos = numeroStr.length();
        int suma = 0;
        // Calcular la suma de cada dígito elevado a la potencia del número de dígitos
        for (char c : numeroStr.toCharArray()) {
            int digito = Character.getNumericValue(c);
            suma += Math.pow(digito, numDigitos);
        }
        // Verificar si la suma es igual al número original
        return suma == numero;
    }
}
