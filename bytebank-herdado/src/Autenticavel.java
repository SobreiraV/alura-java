// essa é uma interface, nada de concreto, tudo abstrato
public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

//	private int senha;
//
//	public boolean autentica(int senha) {
//		if (this.senha == senha) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	public void setSenha(int senha) {
//        this.senha = senha;
//    }

}
