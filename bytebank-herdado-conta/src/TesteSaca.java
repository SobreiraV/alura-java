
public class TesteSaca {

	public static void main(String[] args) throws SaldoInsuficienteException{
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200);
		try {
		conta.saca(210);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(conta.getSaldo());
		
		conta.saca(20);
	}

}