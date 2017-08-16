package model;

public class Professor implements ICoordenador, IDiretor
{	private String nome;
	private String CPF;
	public Professor(String nome, String cPF) {
		super();
		this.nome = nome;
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public void Contratar() {
		// TODO Auto-generated method stub
		
	}
	public void Matricular() {
		// TODO Auto-generated method stub
		
	}

}
