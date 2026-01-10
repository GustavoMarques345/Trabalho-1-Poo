package Classes;

public class Cliente extends Usuario{
	
	private String email;
	private String nro_Celular;
	private String genero;
	private String forma_Pagamento;
	
	public Cliente (String n, String cp, String data, String em, String cel, String gen, String fp) {
		super(n, cp, data);
		this.email = em;
		this.nro_Celular = cel;
		this.genero = gen;
		this.forma_Pagamento = fp;
		
	}
	
	public Cliente(String nome, String cpf) { // Construtor com apenas nome e cpf
		super(nome, cpf, null);
	}
	
	public Cliente() {  // Construtor Default
		super(null, null, null);
	}

	public void setEmail(String email) {
		this.email = email;
	}	
	
	public String getEmail() {
		return email;
	}
	

	public void setNro_Celular(String nro_Celular) {
		this.nro_Celular = nro_Celular;
	}
	
	public String getNro_Celular() {
		return nro_Celular;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	
	public void setForma_Pagamento(String forma_Pagamento) {
		this.forma_Pagamento = forma_Pagamento;
	}
	
	
	public String getForma_Pagamento() {
		return forma_Pagamento;
	}

	
	
	
	

}
