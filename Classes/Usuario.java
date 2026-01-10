package Classes;

public class Usuario {
	
	private String nome;
	private String cpf; 
	private String data_nasc;
	
	public Usuario(String n, String cp, String data) {
		this.nome = n;
		this.cpf = cpf;
		this.data_nasc = data;
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	
	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
	
	
	public String getData_nasc() {
		return data_nasc;
	}
	
	
	
	
	
	
}
