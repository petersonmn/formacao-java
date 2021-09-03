package heranca;

public class Designer extends Funcionario {
	
	public double getBonificacao() {
		return super.getBonificacao() + 200;
	}
}
