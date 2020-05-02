
public class IdControlNumber {

	long idIdControlNumber;
	boolean correctControlNumber;
	byte genderNumber;
	
/**	public void genderNumber() {
		if () {
			
		}
	}
**/
	public void giveMeGenderNumber() {
		long combNumber = idIdControlNumber % 10L;
		combNumber = combNumber / 1000000000000L;
		genderNumber = (byte) combNumber;
	}

}
