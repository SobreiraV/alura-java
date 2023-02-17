
public class TesteConexao {

	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
		}
		
		
		
		//simplificação do código abaixo
		//---------------------------------------------
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//			con.close();
//		} catch (Exception ex) {
//			System.out.println("Deu erro na conexão");
//		} finally {
//			System.out.println("finally");
//			if(con !=null) {
//				con.close();						
//			}
//		}
		
	}
	
}
