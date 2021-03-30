package com.senati.eti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese número: ");
		int n = sc.nextInt();
		
		String estado = "El número es impar";
		
		if (n % 2 == 0)
			estado = "El número es par";
		
		System.out.println(">>>> Resultado <<<<");
		System.out.println(">> Estado: "+ estado);

	}

}
