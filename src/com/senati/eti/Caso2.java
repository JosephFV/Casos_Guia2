package com.senati.eti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese n�mero: ");
		int n = sc.nextInt();
		
		String estado = "El n�mero es impar";
		
		if (n % 2 == 0)
			estado = "El n�mero es par";
		
		System.out.println(">>>> Resultado <<<<");
		System.out.println(">> Estado: "+ estado);

	}

}
