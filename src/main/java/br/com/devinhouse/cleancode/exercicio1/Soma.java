package br.com.devinhouse.cleancode.exercicio1;

public class Soma extends OperacaoMatematica {

	@Override
	public Integer calcular(Integer primeiroNumero, Integer segundoNumero) {
		return primeiroNumero + segundoNumero;
	}

}
