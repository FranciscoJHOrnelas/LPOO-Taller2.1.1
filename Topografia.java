public class Topografia {

	private String nombre;

	public Topografia(String n) {
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

	public void printTopografia() {
		System.out.println(getNombre());
	}
}