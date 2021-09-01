package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);
		
		boolean conseguiuRetirar = conta.saca(113);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaTransfere = new Conta();
		contaTransfere.deposita(1000);
		
		boolean sucessoTransferencia = contaTransfere.transfere(300, conta);
		
		if (sucessoTransferencia) {
			System.out.println("Transferência com sucesso");
		} else {
			System.out.println("Saldo insuficiente, tente um valor menor ou igual à " +contaTransfere.saldo);
		}
		System.out.println(conta.saldo);
		System.out.println(contaTransfere.saldo);
	}

}
