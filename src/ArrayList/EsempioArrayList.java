package ArrayList;

import java.util.ArrayList; //ArrayList non è in java.lang

public class EsempioArrayList {

	public static void main(String[] args) {
		ArrayList<String> miaLista; //dichiarazione di un ArrayList di String
		miaLista = new ArrayList<>(); //creazione dell'ArrayList
		
		//popolamento dell'ArrayList
		miaLista.add("Giulia"); //aggiunta di elementi all'ArrayList con metodo add
		miaLista.add("Francesco");
		miaLista.add("Ciro");
		miaLista.add("Mattia");
		miaLista.add("Francesco");
		miaLista.add("Isabella"); 
		
		
		//manipolazione ArrayList
		miaLista.remove(0); // eliminazione del primo elemento tramite indice
		miaLista.remove(miaLista.size()-1); //eliminazione dell'ultimo elemento (size() dà la dimensione)
		miaLista.remove("Francesco"); //eliminazione per nome del primo trovato (se voglio eliminare tutti ciclo for)
		
		//stampa ArrayList
		for(int i=0; i<miaLista.size(); i++) {
			System.out.println(miaLista.get(i)); //get(i) preleva elemento di posizione i
		}
		int posizione = miaLista.indexOf("Mattia"); // indexOf() dice indice dell'elemento in parentesi, se manca da -1
		System.out.println("indice di Mattia: " + posizione);

	}

}
