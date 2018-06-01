import java.text.NumberFormat;
import java.util.Locale;

public class TestaRelatorio {
	public static void main(String[] args) {
		Divida divida = new Divida();
		divida.setCredor("Credor 1");
		divida.setDocumentoCredor(new Cnpj("00.000.000/0001-01"));
		divida.setTotal(3000);

		Pagamento pagamento1 = new Pagamento();
		pagamento1.setValor(100);
		divida.registra(pagamento1);

		NumberFormat formatadorBrasileiro = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		RelatorioDeDivida relatorio = new RelatorioDeDivida(divida);
		relatorio.geraRelatorio(formatadorBrasileiro);
	}

}
