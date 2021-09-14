package bytebank.herdado.conta;

public class TesteSaca {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		try {
			conta.saca(190.0);
		} catch (SaldoInsuficienteExcepetion e) {
			e.printStackTrace();
		}
		
		System.out.println(conta.getSaldo());
		
	}

}
