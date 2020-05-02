
public class CheckLength {

	long idM; 
	boolean lenghtCorrect;
	
	public void checkLength () {
		int length = String.valueOf(idM).length();
			 if(length == 13) {
					lenghtCorrect = true;
				}else {
					System.out.println("JMBG sadrzi 13 cifara, los unos");
					lenghtCorrect = false;
			 }
		
	}
}