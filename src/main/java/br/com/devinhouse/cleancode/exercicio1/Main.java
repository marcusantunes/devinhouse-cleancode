package br.com.devinhouse.cleancode.exercicio1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Digite um numero: ");
		int primeiroNumero = scanner.nextInt();
		
		System.out.println("Digite outro numero: ");
		int segundoNumero = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Digite a operacao: ");
		String operacao = scanner.nextLine();
		
		OperacaoMatematica operacaoMatematica = getOperacoes().get(operacao);
		calcular(operacaoMatematica, primeiroNumero, segundoNumero);
	}
	
	private static void calcular(OperacaoMatematica operacao, int primeiroNumero, int segundoNumero) {
		System.out.println("Resultado: " + operacao.calcular(primeiroNumero, segundoNumero));
	}
	
	private static Map<String, OperacaoMatematica> getOperacoes() {
		Map<String, OperacaoMatematica> operacaes = new HashMap<>();
		operacaes.put("+", new Soma());
		operacaes.put("-", new Subtracao());
		operacaes.put("*", new Multiplicacao());
		operacaes.put("/", new Divisao());
		return operacaes;
	}

}
