

public abstract class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;  //referencia para outro objeto
	private static int total;
	
	public Conta() {
		
	}
	
	public Conta(int agencia, int numero) { //construtor
		total++;
		//System.out.println("Total de contas: " + total);
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		//System.out.println("Estou criando a conta " + this.numero + " " + this.agencia);
	}

	void deposita(double valor) {
		this.saldo += valor;
		//System.out.println(saldo);
	}

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor); //se o saca não funciona ele não executa o deposita
		destino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Erro: Valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Erro: Valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
