package arrayBi;

public class ArrayBidimensionale {

	public static void main(String[] args) {
		//definisco dimensioni array bidimensionale
		int anni = 5, trimestri = 4;
		int [][] venditeAnnuali; // dichiarazione array bidimensionale
		venditeAnnuali = new int[anni][trimestri]; //creo array bidimensionale
		venditeAnnuali[0][0] = 1000; // 1 trimestre del 1 anno (indici sempre -1)
		venditeAnnuali[0][1] = 1500; // 2 trimestre del 1 anno 
		venditeAnnuali[0][2] = 1800; // 3 trimestre del 1 anno
		venditeAnnuali[1][0] = 1000; // 1 trimestre del 2 anno
		venditeAnnuali[3][3] = 4500; // 4 trimestre del 4 anno
		
		// per stampare decentemente array bidimensionale si usa un ciclo fot annidato in un altro ciclo for
		for (int i=0; i< anni; i++) { //ciclo che scandisce gli anni
			System.out.println("Vendite anno " + (i + 2020) + ":");
			
			for (int j=0; j<trimestri; j++) { // ciclo che scandisce trimestri
				System.out.println(" Trimestre: " + (j+1) + ":" + venditeAnnuali[i][j] + " euro");
			}
			System.out.println();
		}

	}

}
