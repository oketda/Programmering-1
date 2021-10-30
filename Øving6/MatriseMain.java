public class MatriseMain {
	public static void main(String[] args) {
		Matriser objekt = new Matriser();
		
		if (objekt.matrise1.length == objekt.matrise2.length && objekt.matrise1[0].length == objekt.matrise2[0].length) {
			System.out.println("matrise 1 + matrise 2 = ");
			System.out.println("");
			objekt.addisjon();
			objekt.svar();
			objekt.reset();
			System.out.println("");
		}
			
			
		if (objekt.matrise1.length == objekt.matrise2[0].length) {
			System.out.println("matrise 1 * matrise 2 = ");
			System.out.println("");
			objekt.multiplikasjon();
			objekt.svar();
			objekt.reset();
			System.out.println("");
		}
			
			objekt.transponering();
		
	}
}