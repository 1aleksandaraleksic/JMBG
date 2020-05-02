import java.util.Scanner;

// Aleksandar Aleksic
public class IdMain {


	public static void main(String[] args) {
		
		String id;
		long id2 = 0;
		int count = 1;
		boolean correctBoolean = true;
		
		do {
		Scanner scanner = new Scanner (System.in);
			if(count == 1) {
				
			}else {
				scanner.close();
			}
		System.out.println("Unesite VAS JMBG: ");
		id = scanner.next();		
		
				if(id.matches("-?(0|[1-9]\\d*)")) {
					id2 = Long.parseLong(id);
					count = 0;
				} else {
					System.out.println("Jmbg se sastoji samo od cifara!");
				}		
				CheckLength checkLenght = new CheckLength();
				checkLenght.idM = id2;
				id2 = checkLenght.idM;
				
				checkLenght.checkLength();
				
				IdMonth idMonth = new IdMonth();
				idMonth.idMonth = id2;
				
				IdYear idYear = new IdYear();
				idYear.idYearyear = id2;
				
				IdAreaNumber idAreaNumber = new IdAreaNumber();
				idAreaNumber.idIdAreaNumber = id2;
				
				IdCombinationGenderNumber idCombinationGenderNumber = new IdCombinationGenderNumber();
				idCombinationGenderNumber.idIdCombinationGenderNumber =id2;
				
				IdControlNumber idControlNumber = new IdControlNumber();
				idControlNumber.idIdControlNumber =id2;
					
					if(correctBoolean == checkLenght.lenghtCorrect) {
						idMonth.checkMonth();	
						if(correctBoolean == idMonth.monthCorrect){
							idMonth.checkEachMonth();
								if(correctBoolean == idMonth.eachMonthCorrect) {
									idYear.checkYear();
										if(correctBoolean == idYear.yearCorrect) {										
											idAreaNumber.checkArea();
												if(correctBoolean == idAreaNumber.isANumberOfAreaTrue) {
													idCombinationGenderNumber.checkIdControlNumber();
														if(correctBoolean == idCombinationGenderNumber.correctGenderlNumber) {														
															System.out.println("JMBG je validan!!!!");
															count = 0;
														}else {	
															count = 1;
														}
												}else {	
													System.out.println("Kontrolni broj nije dobro unet");
													count = 1;
												}
										 }else {
											 System.out.println("Broj oblasti gde je osoba rodjena nije dobro unet");
											 count = 1;
										 }
								 }else {
									 System.out.println("Godina rodjenja nije dobro uneta");
									 count = 1;
								 }
						}else {
							System.out.println("Dan u mesecu rodjenja nije dobro unet");
							count = 1;
						}
					}else {
						count = 1;
					} 
			}
		while(count !=0);
	}
}
