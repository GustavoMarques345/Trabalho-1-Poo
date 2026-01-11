package Classes;

public class Corrida {
	
	private static double ValorFixoUberland = 0.6;
	
	private Cliente cliente;
	private Motorista motorista;
	private Veiculo veiculo;
	
	private String DataCorrida;
	private String horaCorrida;
	private String horarioChegada;
	private String horarioFinal;
	private double distancia;
	private double duracaoViagem;
	private double valorTotal;
	private double valorExtra;
	private String status;
	private String formaPagamento;
	private double valorUberLand;
	private double valorMotorista;
	
	public Corrida(String dc, String hc, String hchegada, String hf, double dist, double dv, double vt, double ve, String st, String fp, double vu, double vm){
		this.DataCorrida = dc;
		this.horaCorrida = hc;
		this.horarioChegada = hchegada;
		this.horarioFinal = hf;
		this.distancia = dist;
		this.duracaoViagem = dv;
		this.valorTotal = vt;
		this.valorExtra = ve;
		this.status = st;
		this.formaPagamento = fp;
		this.valorUberLand = vu;
		this.valorMotorista = vm;
		
	}
	
	public Corrida (Cliente cli, Veiculo v, String data, String hora ) { //Construtor que recebe cliente e veículo
		this.cliente = cli;
		this.veiculo = v;
		this.DataCorrida = data;
		this.horaCorrida = hora;
	
	
		
	}

	public String getDataCorrida() {
		return DataCorrida;
	}

	public void setDataCorrida(String dataCorrida) {
		DataCorrida = dataCorrida;
	}

	public String getHoraCorrida() {
		return horaCorrida;
	}

	public void setHoraCorrida(String horaCorrida) {
		this.horaCorrida = horaCorrida;
	}

	public String getHorarioChegada() {
		return horarioChegada;
	}

	public void setHorarioChegada(String horarioChegada) {
		this.horarioChegada = horarioChegada;
	}

	public String getHorarioFinal() {
		return horarioFinal;
	}

	public void setHorarioFinal(String horarioFinal) {
		this.horarioFinal = horarioFinal;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double getDuracaoViagem() {
		return duracaoViagem;
	}

	public void setDuracaoViagem(double duracaoViagem) {
		this.duracaoViagem = duracaoViagem;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getValorExtra() {
		return valorExtra;
	}

	public void setValorExtra(double valorExtra) {
		this.valorExtra = valorExtra;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public double getValorUberLand() {
		return valorUberLand;
	}

	public void setValorUberLand(double valorUberLand) {
		this.valorUberLand = valorUberLand;
	}

	public double getValorMotorista() {
		return valorMotorista;
	}

	public void setValorMotorista(double valorMotorista) {
		this.valorMotorista = valorMotorista;
	}
	
}