package esercizio2;

public class Clock {

	public int ora;
	public int minuti;
	
	public void displayPartOfDay() {
		
		if (ora>24 || ora<0 || minuti>60 || minuti<0){ 
			System.out.println("L'orario è errato!");
		
		}
		else if(ora>=6 && (ora<=11 && minuti<=59)){
			System.out.println("E' Mattina!");
		} 
		else if(ora>=12 && (ora<=17 && minuti<=59)){
			System.out.println("E' Pomeriggio!");
		} 
		else if(ora>=18 && (ora<=22 && minuti<=59)){
			System.out.println("E' Sera!");
		} 
		else if(ora>=23 && (ora<=5 && minuti<=59)){
			System.out.println("E' Notte!");
		} 
		
	}
}

