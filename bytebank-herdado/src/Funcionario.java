
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	
	
	public abstract double getBonificacao(); //{ //método abstrato não tem corpo, os filhos que implementarão
		//return this.salario * 0.05;
	//}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}