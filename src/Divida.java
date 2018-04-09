
public class Divida {
	private String nomeCredor;
	private String cnpjCredor;
	private double valorPago;
	private double valorTotal;

	public String getNomeCredor() {
		return nomeCredor;
	}

	public void setNomeCredor(String nomeCredor) {
		this.nomeCredor = nomeCredor;
	}

	public String getCnpjCredor() {
		return cnpjCredor;
	}

	public void setCnpjCredor(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getValorPago() {
		return valorPago;
	}
	
	public void paga(double valor) {
		this.valorPago += valor;
	}
	
}
