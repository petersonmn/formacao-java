package bytebank.herdado.conta;

public class TesteTributaveis {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(122, 133);
		cc.deposita(100.0);

		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(cc);
		calc.registra(seguro);
	
		System.out.println(calc.getTotalImposto());
	}

}
