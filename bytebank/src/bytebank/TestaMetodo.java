package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		/*if(contaDaMarcela.transfere(300, contaDoPaulo)) { //funciona porque tem o retorno é um boolean
			System.out.println("transferido com sucesso");
		} else {
			System.out.println("saldo insuficiente");
		}*/
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);
		
		if(sucessoTransferencia) {
			System.out.println("transferido com sucesso");
		} else {
			System.out.println("saldo insuficiente");
		}
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);
	}

}
