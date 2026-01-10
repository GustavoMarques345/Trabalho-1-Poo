package Classes;

public class UberConfort extends Veiculo {
	
	private static double tarifa = 0.25;
	private static double custoKm = 3;
	
	private boolean espaçoExtra;
	private boolean bancoReclinavel;
	private boolean ar_dualzone;
	
	public UberConfort(String p, String ch, String c, int n_pass, String m, boolean at, boolean ex, boolean br, boolean ad ) {
		super(p, ch, c, n_pass, m, at);
		this.espaçoExtra = ex;
		this.bancoReclinavel = br;
		this.ar_dualzone = ad;
	}

	public boolean isEspaçoExtra() {
		return espaçoExtra;
	}

	public void setEspaçoExtra(boolean espaçoExtra) {
		this.espaçoExtra = espaçoExtra;
	}

	public boolean isBancoReclinavel() {
		return bancoReclinavel;
	}

	public void setBancoReclinavel(boolean bancoReclinavel) {
		this.bancoReclinavel = bancoReclinavel;
	}

	public boolean isAr_dualzone() {
		return ar_dualzone;
	}

	public void setAr_dualzone(boolean ar_dualzone) {
		this.ar_dualzone = ar_dualzone;
	}

	
	
}
