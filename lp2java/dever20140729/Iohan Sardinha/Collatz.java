package br.ort.lp2.teste;

public class Collatz{
	public int tamanhoSequencia(int numeroCollatz){
		if (numeroCollatz == 1){
			return 1;
		}
		else if (numeroCollatz %2 == 0){
			return 1+tamanhoSequencia(numeroCollatz/2);
		}
		else{
			return 1+tamanhoSequencia(3*numeroCollatz+1);
		}
	}

	public int maiorSequencia(int extremo){
		int tamanhoMaiorSequencia = 0;
		int maiorNumeroMaiorSequencia = 0;
		for (int i = 1; i< extremo; i++){
			if(tamanhoSequencia(i) > tamanhoMaiorSequencia){
				maiorNumeroMaiorSequencia = i;
				tamanhoMaiorSequencia = tamanhoSequencia(i);
			}
		}
		return maiorNumeroMaiorSequencia;
	}
}
