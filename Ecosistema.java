public class Ecosistema {

	public static void main(String[] args) {
		Componente_Abiotico ca = new Componente_Abiotico("Componente Abiotico");
		Componente_Biotico cb = new Componente_Biotico("Componente Biotico");
		Consumidores consumidores = new Consumidores("Consumidores");
		Productores productores = new Productores("Productores");
		Descomponedores descomponedores = new Descomponedores("Descomponedores");
		Topografia topografia = new Topografia("Topografia");
		Temperatura temperatura = new Temperatura(24.5);

		ca.printComponente_Abiotico();
		cb.printComponente_Biotico();
		consumidores.printConsumidores();
		productores.printProductores();
		descomponedores.printDescomponedores();
		topografia.printTopografia();
		temperatura.printTemperatura();

	}

}