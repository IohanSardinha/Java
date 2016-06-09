package br.ort.lp2.teste;

public class CollatzTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collatz c = new Collatz();
		System.out.println("A maior sequencia de 1 a 10 é a sequencia do numero "+c.maiorSequencia(10)+" e com "+c.tamanhoSequencia(c.maiorSequencia(10))+" passos para chegar a 1");
		System.out.println("A maior sequencia de 1 a 100 é a sequencia do numero "+c.maiorSequencia(100)+" e com "+c.tamanhoSequencia(c.maiorSequencia(100))+" passos para chegar a 1");
		System.out.println("A maior sequencia de 1 a 1000 é a sequencia do numero "+c.maiorSequencia(1000)+" e com "+c.tamanhoSequencia(c.maiorSequencia(1000))+" passos para chegar a 1");
	}

}
