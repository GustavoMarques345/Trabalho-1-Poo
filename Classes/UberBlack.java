package Classes;

public class UberBlack extends Veiculo {
	
	private static double tarifa = 0.4; 
	private static double custoKm = 5.37;
	
	private boolean possuiAr;
	private boolean possuiConforto;
	private boolean interiorPremium;
	private boolean rodasligaleve;
	private int nro_malas; 
	
	public UberBlack(String p, String ch, String c, int n_pass, String m, boolean at, boolean pa, boolean pc, boolean ip, boolean rl, int nro ) {
		super(p, ch, c, n_pass, m, at);
		this.possuiAr = pa;
		this.possuiConforto = pc;
		this.interiorPremium = ip;
		this.rodasligaleve = rl;
		this.nro_malas = nro;
		
	}

	public boolean isPossuiAr() {
		return possuiAr;
	}

	public void setPossuiAr(boolean possuiAr) {
		this.possuiAr = possuiAr;
	}

	public boolean isPossuiConforto() {
		return possuiConforto;
	}

	public void setPossuiConforto(boolean possuiConforto) {
		this.possuiConforto = possuiConforto;
	}

	public boolean isInteriorPremium() {
		return interiorPremium;
	}

	public void setInteriorPremium(boolean interiorPremium) {
		this.interiorPremium = interiorPremium;
	}

	public boolean isRodasligaleve() {
		return rodasligaleve;
	}

	public void setRodasligaleve(boolean rodasligaleve) {
		this.rodasligaleve = rodasligaleve;
	}

	public int getNro_malas() {
		return nro_malas;
	}

	public void setNro_malas(int nro_malas) {
		this.nro_malas = nro_malas;
	}
	
	
	

}
