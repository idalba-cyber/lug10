package esempioswitch;

public class ControlloMeseTest {

	public static void main(String[] args) {
		ControlloMese mioMese = new ControlloMese();
		mioMese.mese = 7;
		mioMese.calcolaGiorni();
		mioMese.mese = 44;
		mioMese.calcolaGiorni();

	}

}
