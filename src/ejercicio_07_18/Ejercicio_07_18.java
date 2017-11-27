/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_07_18;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejercicio_07_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner
		double[] numeros = new double[10]; // Create an array of length 10 

		// Prompt the user to enter ten numbers
		System.out.print("Ingrese diez numeros: ");
		for (int i = 0; i < numeros.length; i++)
			numeros[i] = input.nextDouble();

		// Invoke bubblesort method
		bubbleSort(numeros);

		// display the sorted numbers
		for (double e: numeros) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	/** bubbleSort */
	public static void bubbleSort(double[] list) {
		double temperatura;
		boolean intercambiado;

		do {
			intercambiado = false; 
			for (int i = 0; i < list.length - 1; i++) {
				// If a neighboring pair is not in order, swap values
				if (list[i] > list[i + 1]) {
					temperatura = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temperatura;
					intercambiado = true;
				}
			}
		} while (intercambiado); // Repeat if a value was swapped
	}
}
