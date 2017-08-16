package model;

public class Diretor implements IDiretor{
	
	private String nome;
	private String CPF;
	public Diretor(String nome, String cPF) {
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
	
	public void Contratar(){
		
	}

}
