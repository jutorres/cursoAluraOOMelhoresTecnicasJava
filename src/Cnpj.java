
public class Cnpj implements Documento {
	private String valor;
	
	public Cnpj(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return this.valor;
	}
	
	public boolean ehValido() {
		return primeiroDigitoVerificadorDoCnpj() == primeiroDigitoCorretoParaCnpj()
				&& segundoDigitoVerificadorDoCnpj() == segundoDigitoCorretoParaCnpj();
	}

	private int primeiroDigitoCorretoParaCnpj() {
		return 0;
	}

	private int primeiroDigitoVerificadorDoCnpj() {
		return 0;
	}

	private int segundoDigitoCorretoParaCnpj() {
		return 0;
	}

	private int segundoDigitoVerificadorDoCnpj() {
		return 0;
	}
	
	public boolean equals(Object o) {
        if(!(o instanceof Cnpj)) {
            return false;
        } 
        Cnpj outro = (Cnpj) o;
        return this.valor.equals(outro.valor);
    }
	
	public int hashCode() {
        return this.valor.hashCode();
    }
	
	@Override
	public String toString() {
		return getValor();
	}

}
