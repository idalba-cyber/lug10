package arrayMono;

public class EsempioArray {

	public static void main(String[] args) {
		
		String[] numeri = new String[2]; //dichiarazione e creazione array di String con dimensione 2

		numeri[0] = "5"; // inserisco "5" come primo elemento di array (posizione 0)
		numeri[1] = "4";
		
		System.out.println("Concatenazione: " + (numeri[0] + numeri[1]));
		
		int[] numeriVeri = new int[2]; //altro array di int
		numeriVeri[0] = Integer.parseInt(numeri[0]); //tramite la classe Wrapper Integer, si richiama il metodo parseInt() 
		//che recupera il valore numerico della String del primo array (converte String in valore int)
		numeriVeri[1] = Integer.parseInt(numeri[1]);
		
		System.out.println("Totale: " + (numeriVeri[0] + numeriVeri[1]));
		
		double[] prezzi = {12.99, 32.00, 7, 50}; // array di double dichiarato, creato e inizializzato in un'unica istruzione
		
		System.out.println(prezzi[0]);
	}

}
