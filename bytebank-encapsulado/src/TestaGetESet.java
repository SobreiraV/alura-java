
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		//conta.numero = 1337 // não compila pois é privado
		//conta.setNumero(1337); //esse era antes de passar nos argumentos
		
		//System.out.println(conta.numero); // não funciona pois é privado
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo;  //privado
		
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		Cliente titularDaConta = conta.getTitular(); //mesma coisa da linha anterior mas com variavel definida
		titularDaConta.setProfissao("Programador2");
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
		}
}
