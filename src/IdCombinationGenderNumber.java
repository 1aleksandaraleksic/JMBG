
public class IdCombinationGenderNumber {
	
	long idIdCombinationGenderNumber;
	boolean correctGenderlNumber;
	byte combinationNumber;
	
	public void giveMeIdControlNumber() {
		long combinationN = idIdCombinationGenderNumber % 10;
		combinationNumber = (byte) combinationN;
	}
	
	public void checkIdControlNumber() {
		
		giveMeIdControlNumber();
		
		long combinationNa = idIdCombinationGenderNumber / 1000000000000L;
		byte a = (byte) combinationNa;
		
		long combinationNb = idIdCombinationGenderNumber / 100000000000L;
		 combinationNb = combinationNb % 10;
		byte b = (byte) combinationNb;
		
		long combinationNv = idIdCombinationGenderNumber / 10000000000L;
		 combinationNv = combinationNv % 10;
		byte v = (byte) combinationNv;
		
		long combinationNg = idIdCombinationGenderNumber / 1000000000L;
		 combinationNg = combinationNg % 10;
		byte g = (byte) combinationNg;		

		long combinationNd = idIdCombinationGenderNumber / 100000000L;
		 combinationNd = combinationNd % 10;
		byte d = (byte) combinationNd;
		
		long combinationNdj = idIdCombinationGenderNumber / 10000000L;
		 combinationNdj = combinationNdj % 10;
		byte dj = (byte) combinationNdj;
		
		long combinationNe = idIdCombinationGenderNumber / 1000000L;
		 combinationNe = combinationNe % 10;
		byte e = (byte) combinationNe;
		
		long combinationNZ = idIdCombinationGenderNumber / 100000L;
		 combinationNZ = combinationNZ % 10;
		byte Z = (byte) combinationNZ;
		
		long combinationNz = idIdCombinationGenderNumber / 10000L;
		 combinationNz = combinationNz % 10;
		byte z = (byte) combinationNz;
		
		long combinationNi = idIdCombinationGenderNumber / 1000L;
		 combinationNi = combinationNi % 10;
		byte i = (byte) combinationNi;
		
		long combinationNj = idIdCombinationGenderNumber / 100L;
		 combinationNj = combinationNj % 10;
		byte j = (byte) combinationNj;
		
		long combinationNk = idIdCombinationGenderNumber / 10L;
		 combinationNk = combinationNk % 10;
		byte k = (byte) combinationNk;

		int L = 11 - ((7*(a+e)+6*(b+Z)+5*(v+z)+4*(g+i)+3*(d+j)+2*(dj+k)) % 11);
		
		if(combinationNumber == L) {
			correctGenderlNumber = true;
		}
		else {
			correctGenderlNumber = false;
			System.out.println("Kontrolna cifra nije dobro uneta");
		}
	}
	
	
}
