public class Temperatura {

	private double grados_centigrados;

	public Temperatura(double gc) {
		this.grados_centigrados = gc;
	}

	public double getGrados_centigrados() {
		return this.grados_centigrados;
	}

	/**
	 * 
	 * @param grados_centigrados
	 */
	public void setGrados_centigrados(double grados_centigrados) {
		this.grados_centigrados = grados_centigrados;
	}

	public void printTemperatura() {
		System.out.println(getGrados_centigrados());
	}
}