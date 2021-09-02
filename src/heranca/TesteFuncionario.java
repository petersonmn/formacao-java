package heranca;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario peterson = new Funcionario();
		peterson.setNome("Peterson Martins");
		peterson.setCpf("999.999.999-99");
		peterson.setSalario(2600.00);
		
		System.out.println(peterson.getNome());
		System.out.println(peterson.getBonificacao());
		
	}

}
