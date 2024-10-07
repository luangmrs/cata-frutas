package terreno;

/**
 * Classe mãe de todos objetos estáticos do terreno.
 */
public class ObjEstaticos {
	protected String tipo;

	public ObjEstaticos(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

}