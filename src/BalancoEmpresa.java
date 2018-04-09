import java.util.HashMap;

public class BalancoEmpresa {
	
	private HashMap<String, Divida> dividas = new HashMap<String, Divida>();
	
	public void resgistraDivida(String nome, String cnpj, double valor) {
		Divida divida = new Divida();
		divida.setNomeCredor(nome);
		divida.setCnpjCredor(cnpj);
		divida.setValorTotal(valor);
		dividas.put(cnpj, divida);
	}
	
	public void pagaDivida(String cnpj, double valor) {
		Divida divida = dividas.get(cnpj);
		if(divida != null) {
			divida.paga(valor);
		}
	}
}
