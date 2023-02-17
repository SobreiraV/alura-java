//Gerente é um funcionario, gerente herda da class Funcionario
public class Designer extends Funcionario{

	

	public double getBonificacao() {
		System.out.println("designer");
		return 200.0;
	}
}
