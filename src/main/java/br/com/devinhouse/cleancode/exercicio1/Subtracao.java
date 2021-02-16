package br.com.devinhouse.cleancode.exercicio1;

public class Subtracao extends OperacaoMatematica {

	@Override
	public Integer calcular(Integer primeiroNumero, Integer segundoNumero) {
		return primeiroNumero - segundoNumero;
	}

}
