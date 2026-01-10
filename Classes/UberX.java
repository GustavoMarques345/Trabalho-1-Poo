package Classes;

public class UberX extends Veiculo{
	
	private static double tarifa = 0.1; // Tarifa do carro
	private static double custoKm = 2.50; // Custo por kilometro
	
	private boolean possuiAr; // Indica se possui ar condicionado;
	
	public UberX(String p, String ch, String c, int n_pass, String m, boolean at, boolean possui) {
		super(p, ch, c, n_pass, m, at);
		this.possuiAr = possui;
		
	}

	public boolean isPossuiAr() {
		return possuiAr;
	}

	public void setPossuiAr(boolean possuiAr) {
		this.possuiAr = possuiAr;
	}
	
	
	
	

}
