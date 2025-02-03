package SegundoTrimestre;

import java.util.Scanner;

public class FactorialPractice {
public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese un numero entero: ");
		int numero = entrada.nextInt();

		if(numero<0) {
			System.out.println("No es un numero correcto, ingrese un numero positivo");
		}else {
			System.out.println("El factorial de "+numero+" es: "+factorial(numero));
		}

        entrada.close();
	}

	public static int factorial(int n) {
	    if (n == 0) {
	        return 1;
	    } else {
	        return n * factorial(n - 1);
	    }
	}
}