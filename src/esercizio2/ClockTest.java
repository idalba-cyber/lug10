package esercizio2;

public class ClockTest {

	public static void main(String[] args) {
		Clock myClock = new Clock();
		
		myClock.ora = 15;
		myClock.minuti = 46;
		myClock.displayPartOfDay();
		
		myClock.ora = 20;
		myClock.minuti = 75;
		myClock.displayPartOfDay();

	}

}