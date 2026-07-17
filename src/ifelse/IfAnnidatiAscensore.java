package ifelse;

public class IfAnnidatiAscensore{
	// variabili globali
		public boolean portaAperta = false; // porta chiuse per sicurezza
		public int pianoCorrente = 0; // l'ascensore parte dal piano terra
		public final int PIANO_MIN = 0; //piano più basso (terra)
		public final int PIANO_MAX = 10; // piano più alto

		// metodi
		public void apriPorta() {
			System.out.println("Sto aprendo la porta");
			portaAperta = true;
			System.out.println("La porta è aperta");
		}
		
		public void chiudiPorta() {
			System.out.println("Sto chiudendo la porta");
			portaAperta = false;
			System.out.println("La porta è chiusa");
		}
		
		public void vaiSu() {
			
			if (pianoCorrente< PIANO_MAX) { // verifico se posso salire
				
				if(portaAperta) { // è un boolean quindi non devo scrivere == true
					chiudiPorta(); //posso salire, ma la porta è chiusa? Se aperta la chiudo
				}
				System.out.println("Sto salendo di un piano");
				pianoCorrente++; // ++ aggiorna automaticamente la variabile
				System.out.println("Piano: " + pianoCorrente);
			} else {
				System.out.println("Ascensore già al piano: " + PIANO_MAX + "!");
			}
			
		}
		
		public void vaiGiu() {
			
			if (pianoCorrente > PIANO_MIN) { //verifico se posso scendere
				
				if(portaAperta) { // è un boolean quindi non devo scrivere == true
					chiudiPorta(); //posso scendere, ma la porta è chiusa? Se aperta la chiudo
				}
				System.out.println("Sto scendendo di un piano");
				pianoCorrente--; // -- aggiorna automaticamente la variabile
				System.out.println("Piano: " + pianoCorrente);
			} else {
				System.out.println ("Ascensore già al piano " + PIANO_MIN + "!");
			}
			
		}
	}
