package bytebank.herdado.conta;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public Conta(int numero) {
		this(2025, numero);
	}

	public abstract void deposita(double valor); 

	public void saca(double valor) throws SaldoInsuficienteExcepetion {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteExcepetion("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
		
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteExcepetion {
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor negativo");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode valor negativo");
			return;
		}
		this.numero = numero;
	}
	
	public static int getTotal() {
		return Conta.total;
	}	
}
