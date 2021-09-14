package bytebank.composto;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente peterson = new Cliente();
		peterson.nome = "Peterson Martins";
		peterson.cpf = "222.222.222-22";
		peterson.profissao = "Programador";
		
		Conta contaDoPeterson = new Conta();
		contaDoPeterson.deposita(100);
		
		contaDoPeterson.titular = peterson;
		
		System.out.println(contaDoPeterson.titular.nome);
	}

}

