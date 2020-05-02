
public class IdMonth {

	long idMonth;
	boolean monthCorrect, eachMonthCorrect;
	byte month, bM;	

	public void checkMonth() {
		 giveMeMonth();
			if(month<13 && month>0) {
			monthCorrect = true;
			}else {
				monthCorrect = false;
				System.out.println("Mesec u Vasem JMBG-u nije dobro unet!");
			}
	}
	
	public void checkEachMonth() {

		giveMeMonth();
		cutToDate();
		
		switch(month) {
		
		case 1: 
			if(bM<32 && bM>0) {
				eachMonthCorrect = true;
			}else {
				eachMonthCorrect = false;
			}
		
		case 2:
			if(bM == 28 || bM ==29) {
				eachMonthCorrect = true;
			}else {
				eachMonthCorrect = false;
			}
			
		case 3: case 5: case 7: case 8: case 10: case 12:
			if(bM<32 && bM>0) {
				eachMonthCorrect = true;
			}else {
				eachMonthCorrect = false;
			}
			
		case 4: case 6:case 9: case 11:
			if(bM<31 && bM>0) {
				eachMonthCorrect = true;
			}else {
				eachMonthCorrect = false;
			}
		
		}
	}
	
	public void giveMeMonth() {
		long lMonth = idMonth % 100000000000L;
		lMonth = lMonth / 1000000000L;
		month= (byte) lMonth;
	}
	
	public void cutToDate() {
		long calcDay = idMonth / 100000000000L;
		bM = (byte) calcDay;
		
	}		
}
