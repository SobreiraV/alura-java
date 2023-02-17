package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java",
				"Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		
		//javaColecoes.getAlunos().add(a1); //não é interessante por n motivos incluindo para não quebrar o encapsulamento
		
		//javaColecoes.matricula(a1);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("O alunno " + a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		//String nome = "Rodrigo Turini";
		//System.out.println(javaColecoes.estaMatriculado(nome)); //não funciona pois os aluno não é uma string, e o estamatriculado trabalha com aluno
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse Turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("O a1 é == ao Turini?");
		System.out.println(a1 == turini); //false porque ele não é o mesmo
		System.out.println(a1.equals(turini));
		
		//obrigatoriamente o seguinte é true
		
		System.out.print("Mesmo hash: ");
		System.out.println(a1.hashCode() == turini.hashCode());
		
//		for(Aluno a : javaColecoes.getAlunos()) {
//			System.out.println(a);
//		}
		
		Set<Aluno> alunos = javaColecoes.getAlunos(); //para versões antigas do java que não tem for
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		//iterador.hasNext(); //se tem proximo
		//iterador.next(); //passa pro proximo
		
		//Aluno depoisDoUltimo = iterador.next(); //erro por que não tem mais elementos na lista
		
		//Vector<Aluno> vetor = new Vector<>(); //classe muito velha parecido com lista, mas é tread safe entre varias treads simultaneamentes
		
	}
}
