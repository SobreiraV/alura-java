package bytebank;

public class TesteReferencias {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println(segundaConta.saldo);
		
		segundaConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
		System.out.println(segundaConta.saldo);
		
		//as duas variaveis são referencias para o mesmo objeto
	}

}
