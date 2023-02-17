
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		conta.saca(200);
		//System.out.println(conta.saldo); //saldo continua 100 por que não foi sacado //classe privada agora não pode ler
		System.out.println(conta.getSaldo());
	}

}
