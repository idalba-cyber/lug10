package esempioswitch;

public class ControlloMese {
	public int mese;
	
	public void calcolaGiorni() {
		switch (mese) { // nelle parentesi tonde dello switch metto l'entità che voglio confrontare
			case 1: //gennaio
			case 3: //marzo
			case 5: //maggio
			case 7: //luglio
			case 8: //agosto
			case 10: //ottobre
			case 12: //dicembre
				
				System.out.println("Ci sono 31 giorni in questo mese.");
				break; //esco dallo switch senza effettuare altri confronti inutili
			case 2: //febbraio
				System.out.println("Ci sono 28 o 29 giorni in questo mese.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Ci sono 30 giorni in questo mese.");
				break;
				
			default: //finisco qui se nessuno dei case è verificato
				System.out.println("Numero del mese errato!");
				// break opzionale, lo switch termina qui
		}
	}
}
