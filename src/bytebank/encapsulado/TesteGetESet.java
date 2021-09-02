package bytebank.encapsulado;

public class TesteGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente peterson = new Cliente();
		peterson.setNome("Peterson Martins");
		
		conta.setTitular(peterson);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		System.out.println(conta.getTitular().getProfissao());
	}

}
