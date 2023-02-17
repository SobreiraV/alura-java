
public class testaValores {
	
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		System.out.println(segundo); //5 pq o primeiro foi alterado depois do segundo já ter recebido o valor
		//System.out.println(primeiro);
	}
}
