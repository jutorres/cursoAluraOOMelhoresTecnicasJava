import java.text.NumberFormat;

public class RelatorioDeDivida {
	
	private Divida divida;

	public RelatorioDeDivida(Divida divida) {
		this.divida = divida;
	}
	
	public void geraRelatorio(NumberFormat formatadorDeNumeros) {
		System.out.println("Credor: " + divida.getCredor());
		System.out.println("Cnpj credor: " + divida.getCnpjCredor());
		System.out.println("Valor a pagar: " + formatadorDeNumeros.format(divida.valorAPagar()));
		System.out.println("Valor total: " + formatadorDeNumeros.format(divida.getTotal()));
	}
}
