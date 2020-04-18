package negocio;

public class Jogador {
	public int numeroCamisa;
	public float salario;
	public int qtdTimes;
	public boolean premio;
	public String nome;
	
	
	public void imprimir() {
		System.out.printf("Esse ano o jogador %s vestirá a camisa %d \n",
				nome,
				numeroCamisa
			);
		System.out.printf("%s já passou por %d times(s) e %s prêmios \n",
				nome,
				qtdTimes,
				verificarPremio()
			);
		System.out.printf("O salário pago à %s será R$%.2f \n",
				nome,
				calcularSalario()
			);
	}
	
	private  String verificarPremio() {
		return premio ? "ganhou" : "não ganhou";
//		
//		if (premio) {
//			return "ganhou";
//			
//		} else {
//			return "não ganhou";
//		}
//				
	}
	
	private float calcularSalario() {
//		float valorPorTime = 10000 * qtdTimes;
//
//		float valorPorPremio = premio ? 5000 : 0;
//		
//		return salario + valorPorTime + valorPorPremio ;

		// a parte de cima foi resolvida com uma linha.... otimizando o código
		// partes bem definidas e curtas caso contrário vale mais a pena usar variáveis temporárias
		return salario + (10000 * qtdTimes) + (premio ? 5000 : 0);

	}

}
