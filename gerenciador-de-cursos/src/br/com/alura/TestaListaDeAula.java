package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revisitando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		//aulas.add("Equals e Hashcode"); //Não funciona porque é apenas para aula
		
		System.out.println(aulas); //mostra o endereço do objeto
		
		Collections.sort(aulas); //não sabe ordenar aulas sem o import util
		
		System.out.println(aulas);
		
		String s1 = "paulo";
		String s2 = "silveira";
		s1.compareTo(s2); //compara quem é maior lexograficamente //devolve -1, 0, 1 de acordo com a comparação
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo)); //mesmo do de cima
	}
	
	
}
