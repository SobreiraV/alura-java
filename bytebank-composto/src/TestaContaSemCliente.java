
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		//System.out.println(contaDaMarcela.saldo); //parou de funciona por que agora o atributo é private
		
		System.out.println(contaDaMarcela.titular); //é null por que ainda não foi criado Cliente
		//contaDaMarcela.titular.nome = "Marcela"; 
		//System.out.println(contaDaMarcela.titular.nome); //erro por que não existe
		
		contaDaMarcela.titular = new Cliente();
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular);
		System.out.println(contaDaMarcela.titular.nome);
	}
}
