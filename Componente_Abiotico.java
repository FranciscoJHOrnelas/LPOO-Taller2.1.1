public class Componente_Abiotico {

	private String nombre;

	public Componente_Abiotico(String n) {
		this.nombre = n;
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void printComponente_Abiotico() {
		System.out.println(getNombre());
	}
}