
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		//cliente.setSalario(3000.0);
		
		//Funcionario nico = new Funcionario(); //parou de funcionar depois do abstract
		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("111.111.111-11");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}
}
