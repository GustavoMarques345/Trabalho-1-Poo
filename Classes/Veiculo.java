package Classes;

public class Veiculo {
	
	private String placa;
	private String chassi;
	private String cor;
	private int nro_passageiros;
	private String marca;
	private boolean ativado; // Indoca se o veículo está ativado ou não
	
	public Veiculo (String p, String ch, String c, int n_pass, String m, boolean at ) {
		this.placa = p;
		this.chassi = ch;
		this.cor = c;
		this.nro_passageiros = n_pass;
		this.marca = m;
		this.ativado = at;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getPlaca() {
		return placa;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getChassi() {
		return chassi;
	}

	

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNro_passageiros() {
		return nro_passageiros;
	}

	public void setNro_passageiros(int nro_passageiros) {
		this.nro_passageiros = nro_passageiros;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}

	

	public boolean isAtivado() {
		return ativado;
	}

	public void setAtivado(boolean ativado) {
		this.ativado = ativado;
	}
	
	
	
	
	
}
