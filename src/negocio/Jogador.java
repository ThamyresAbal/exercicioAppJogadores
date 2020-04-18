package negocio;

public class Jogador {
	public int numeroCamisa;
	public float salario;
	public int qtdTimes;
	public boolean premio;
	public String nome;
	
	
	public void imprimir() {
		System.out.printf("Esse ano o jogador %s vestir� a camisa %d \n",
				nome,
				numeroCamisa
			);
		System.out.printf("%s j� passou por %d times(s) e %s pr�mios \n",
				nome,
				qtdTimes,
				verificarPremio()
			);
		System.out.printf("O sal�rio pago � %s ser� R$%.2f \n",
				nome,
				calcularSalario()
			);
	}
	
	private  String verificarPremio() {
		return premio ? "ganhou" : "n�o ganhou";
//		
//		if (premio) {
//			return "ganhou";
//			
//		} else {
//			return "n�o ganhou";
//		}
//				
	}
	
	private float calcularSalario() {
//		float valorPorTime = 10000 * qtdTimes;
//
//		float valorPorPremio = premio ? 5000 : 0;
//		
//		return salario + valorPorTime + valorPorPremio ;

		// a parte de cima foi resolvida com uma linha.... otimizando o c�digo
		// partes bem definidas e curtas caso contr�rio vale mais a pena usar vari�veis tempor�rias
		return salario + (10000 * qtdTimes) + (premio ? 5000 : 0);

	}

}
