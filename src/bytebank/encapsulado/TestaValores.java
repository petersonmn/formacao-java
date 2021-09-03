package bytebank.encapsulado;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(2025, 50);
		
		System.out.println(conta.getAgencia());
		
//		Conta conta2 = new Conta(2025, 500);
//		Conta conta3 = new Conta(2025, 501);
		
		System.out.println(Conta.getTotal());

	}

}
