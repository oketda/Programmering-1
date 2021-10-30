public class TemperaturMain {
	public static void main(String[] args) {
		Temperatur objekt = new Temperatur();
		
		objekt.gjennomsnittDag();
		System.out.println("");
		objekt.gjennomsnittTimeDøgn();
		System.out.println("");
		objekt.gjennomsnittMåned();
		System.out.println("");
		objekt.spesifikTemperatur();
	}
}