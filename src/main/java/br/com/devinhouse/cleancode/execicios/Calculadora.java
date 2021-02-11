package br.com.devinhouse.cleancode.execicios;

import java.util.Scanner;

public class Calculadora {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n1;
		int n2;
		String op;
		
		System.out.println("Primeiro número: ");
		n1 = in.nextInt();
		
		System.out.println("Segundo número: ");
		n2 = in.nextInt();
		
		System.out.println("Escolha uma operação: Soma (+) Subtração (-) Multiplicação (*) Divisão (/): ");
		op = in.next();

		if (op.equals("+")) {
			System.out.println("Resultado final " + (n1 + n2));
		} else if (op.equals("-")) {
			System.out.println("Resultado final " + (n1 - n2));
		} else if (op.equals("*")) {
			System.out.println("Resultado final " + (n1 * n2));
		} else if (op.equals("/")) {
			System.out.println("Resultado final " + (n1 / n2));
		} else {
			System.out.println("Operação inválida");
		}
	}

}
