//Gerente é um funcionario, gerente herda da class Funcionario
public class EditorVideo extends Funcionario{

	

	public double getBonificacao() {
		System.out.println("editor");
		return  150.0;
	}
}
