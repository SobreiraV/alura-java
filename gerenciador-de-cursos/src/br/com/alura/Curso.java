package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	// private List<Aluno> alunos = new ArrayList<>();
	// private Set<Aluno> alunos = new TreeSet<>(); //treeset só funciona para
	// classes comparable
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	//private Map<Integer, Aluno> matriculaParaAluno = new LinkHashMap<>(); //ele guarda a ordem das linhas / ordem dos puts
	
	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas); // não deixa modificar a lista
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

//	public int getTempoTotal() {
//		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
//		return tempoTotal;
//	}

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "[Curso; " + nome + ", tempo total: " + this.getTempoTotal() + ", " + "aulas: " + this.aulas + "]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

//	public List<Aluno> getAlunos() {
//		return Collections.unmodifiableList(alunos);
//	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

//	public Aluno buscaMatriculado(int numero) {
//		for (Aluno aluno : alunos) {
//			if(aluno.getNumeroMatricula() == numero)
//				return aluno;
//		}
//		throw new NoSuchElementException("Matricula não encontrada " + numero);
//	}
//	
	public Aluno buscaMatriculado(int numero) {
		if(!matriculaParaAluno.containsKey(numero))
			throw new NoSuchElementException();
		return matriculaParaAluno.get(numero);
	}
}
