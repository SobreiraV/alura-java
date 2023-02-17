
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		/*conta.setAgencia(-50);
		conta.setNumero(-330);*/
		
		System.out.println(conta.getAgencia()); //se você não passa por paramentros ela já nasce inconsistente em relação a nossa regra de não poder ser 0
		
		@SuppressWarnings("unused")
		Conta conta2 = new Conta(1337, 16549);
		@SuppressWarnings("unused")
		Conta conta3 = new Conta(1337, 14660);
		
		//System.out.println(Conta.total);  //funciona pois é static, mas lembresse que é privado então precisamos do get
		
		System.out.println("Total de contas: " + Conta.getTotal());
	}
}
