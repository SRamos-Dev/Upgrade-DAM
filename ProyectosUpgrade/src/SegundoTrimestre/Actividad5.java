package SegundoTrimestre;

public class Actividad5 {

    public static void main(String[] args) {
        int[] numerosEnteros = {1, 2, 3, 4, 5};
        double[] numerosDecimales = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] cadenas = {"a", "b", "c", "d", "e"};
        System.out.println(calcular(numerosEnteros)); 
        System.out.println(calcular(numerosDecimales)); 
        System.out.println(calcular(cadenas)); 
    }

    // Función para calcular la media de un array de enteros
    public static double calcular(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero; // Suma todos los números del array
        }
        return (double) suma / numeros.length; // Devuelve la media
    }

    // Función para calcular la moda de un array de números decimales
    public static double calcular(double[] numeros) {
        double moda = numeros[0];
        int maxCount = 0;
        for (int i = 0; i < numeros.length; i++) {
            int count = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] == numeros[i]) count++; // Cuenta las ocurrencias de cada número
            }
            if (count > maxCount) {
                maxCount = count; // Actualiza el máximo conteo
                moda = numeros[i]; // Actualiza la moda
            }
        }
        return moda; // Devuelve la moda
    }

    // Función para calcular la mediana de un array de cadenas
    public static String calcular(String[] cadenas) {
        java.util.Arrays.sort(cadenas); // Ordena las cadenas alfabéticamente
        int medio = cadenas.length / 2;
        if (cadenas.length % 2 == 0) {
            return cadenas[medio - 1]; // En caso de longitud par, devuelve la más baja de las dos centrales
        } else {
            return cadenas[medio]; // En caso de longitud impar, devuelve la cadena central
        }
    }
}