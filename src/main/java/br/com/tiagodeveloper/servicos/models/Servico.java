package br.com.tiagodeveloper.servicos.models;

public class Servico {
	
	private Integer id;
	private String nome;
	private Boolean ativo;
	public Servico(Integer id, String nome, Boolean ativo) {
		super();
		this.id = id;
		this.nome = nome;
		this.ativo = ativo;
	}
	public Servico() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	@Override
	public String toString() {
		return "Servico [id=" + id + ", nome=" + nome + ", ativo=" + ativo + "]";
	}
}
