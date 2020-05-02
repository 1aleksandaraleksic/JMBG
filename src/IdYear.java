
public class IdYear {

	long idYearyear;
	short year1;
	boolean yearCorrect;
	
	public void checkYear() {
		makeAYear();
		if ((year1>880 && year1<=999)||(year1>=000 && year1<=020)) {
			yearCorrect = true;
		}else {
			yearCorrect = false;
		}
	}
	
	
	public void makeAYear() {
		long year2= idYearyear  / 1000000L;
		year2 = year2 % 1000L;
		year1 = (short) year2;
	}
}
