package teste;

import negocio.Jogador;

public class TesteJogador {

	public static void main(String[] args) {
		
//		int numeroCamisa = Integer.valueOf(args[0]);
//		float salrio = Float.valueOf(args[1]);
//		int qtdTimes = Integer.valueOf(args[2]);
//		
//		// padrao para programação e testar o booleano sem usar o if
//		//ao inves de criar o que tinha no if usa-se esse siistema
//		boolean premio = "sim".equalsIgnoreCase(args[3]);
//		
//		String nome = args[4];
		
		Jogador jogador = new Jogador();
		
		jogador.numeroCamisa = Integer.valueOf(args[0]);
		jogador.salario = Float.valueOf(args[1]);
		jogador.qtdTimes = Integer.valueOf(args[2]);
		
		// ignore case transforma a string toda em maiusculo sendo assim qualquer variacao de sim
		// vai funcionar normalmente
		// lembrando que a condicional deve vir na frente do equals para que seja testada primeiro
		// caso contrário o valor testado será null e entrará no teste de condicional (else)
		jogador.premio = "sim".equalsIgnoreCase(args[3]);
		jogador.nome = args[4];
		
		jogador.imprimir();

	}

}
