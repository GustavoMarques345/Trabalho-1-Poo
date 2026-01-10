package Classes;

public class Motorista extends Usuario {
	
	private String endereco;
	private String cnh;
	private String nome_Social;
	private Veiculo veiculo; // Cada motorista possui um veiculo cadastrado

	public Motorista (String n, String cp, String data, String end, String c, String social) {
		super(n, cp, data);
		this.endereco = end;
		this.cnh = c;
		this.nome_Social = social;
	}

	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	
	
	public String getEndereco() {
		return endereco;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getCnh() {
		return cnh;
	}

	public void setNome_Social(String nome_Social) {
		this.nome_Social = nome_Social;
	}


	public String getNome_Social() {
		return nome_Social;
	}
	
	
	
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	
	public Veiculo getVeiculo() {
		return veiculo;
	}

	
	
	
	
	
}
