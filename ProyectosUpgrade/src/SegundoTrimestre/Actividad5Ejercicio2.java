package SegundoTrimestre;

import java.util.Scanner;

public class Actividad5Ejercicio2 {

    // Función para calcular combinaciones (n choose k) de forma recursiva
    public static int calcularCombinaciones(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return calcularCombinaciones(n - 1, k - 1) + calcularCombinaciones(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario los valores de n y k
        System.out.print("Introduce el tamaño del conjunto (n): ");
        int n = scanner.nextInt();

        System.out.print("Introduce el tamaño del subconjunto (k): ");
        int k = scanner.nextInt();

        // Verifica que los valores sean válidos
        if (n < 0 || k < 0 || k > n) {
            System.out.println("Valores inválidos. Asegúrate de que 0 <= k <= n.");
        } else {
            // Calcula y muestra el resultado
            int combinaciones = calcularCombinaciones(n, k);
            System.out.println("El número total de combinaciones es: " + combinaciones);
        }

        scanner.close();
    }
}
