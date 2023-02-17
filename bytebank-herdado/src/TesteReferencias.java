
public class TesteReferencias {
	public static void main(String[] args) {
		Funcionario g1 = new Gerente();
		//Funcionario g1 = new Gerente(); //polimorfismo
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		//Funcionario f = new Funcionario(); --> parou de funcionar depois do abstrac
		//f.setSalario(2000.0);
		
		Funcionario ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Funcionario d = new Designer();
		ev.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1); //funciona por causa que todos são originarios do objeto Funcionario
		//controle.registra(f);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		
		
		/*String nome = g1.getNome(); System.out.println(nome);*/
		
	}

}
