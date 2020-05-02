
public class IdAreaNumber {

	long idIdAreaNumber;
	boolean isANumberOfAreaTrue;
	byte areaNumber;

	public void giveMeAreaNumber() {
		long lAreaNumber = idIdAreaNumber % 1000000L;
		lAreaNumber = lAreaNumber / 10000L;
		areaNumber = (byte) lAreaNumber;
	}
	
	public void checkArea() {
		
		giveMeAreaNumber();
		
		switch(areaNumber) {
		//Stranci bez drzavljanstva bivse SFRJ ili njenih naslednica
		case 1 : 
			System.out.println("stranci u BiH"); 
			isANumberOfAreaTrue = true;
			break;
		case 2 : 
			System.out.println("stranci u Crnoj Gori");
			isANumberOfAreaTrue = true;
			break;
		case 3 : 
			System.out.println("stranci u Hrvatskoj");
			isANumberOfAreaTrue = true;
			break;
		case 4 : 
			System.out.println("stranci u Makedoniji");
			isANumberOfAreaTrue = true;
			break;
		case 5: 
			System.out.println("stranci u Sloveniji");
			isANumberOfAreaTrue = true;
			break;
		case 6:
			isANumberOfAreaTrue = false;
			break;
		case 7: 
			System.out.println("stranci u Srbiji (bez pokrajina)");
			isANumberOfAreaTrue = true;
			break;
		case 8: 
			System.out.println("stranci u Vojvodini");
			isANumberOfAreaTrue = true;
			break;
		case 9: 
			System.out.println("stranci na Kosovu i Metohiji");
			isANumberOfAreaTrue = true;
			break;
	
		//Bosna i Hercegovina
		case 10:
			System.out.println("Banja Luka");
			isANumberOfAreaTrue = true;
			break;
		case 11: 
			System.out.println("Bihac");
			isANumberOfAreaTrue = true;
			break;
		case 12: 
			System.out.println("Doboj");
			isANumberOfAreaTrue = true;
			break;
		case 13: 
			System.out.println("Gorazde");
			isANumberOfAreaTrue = true;
			break;
		case 14: 
			System.out.println("Livno");
			isANumberOfAreaTrue = true;
			break;
		case 15: 
			System.out.println("Mostar");
			isANumberOfAreaTrue = true;
			break;
		case 16: 
			System.out.println("Prijedor");
			isANumberOfAreaTrue = true;
			break;
		case 17: 
			System.out.println("Sarajevo");	
			isANumberOfAreaTrue = true;
			break;
		case 18: 
			System.out.println("Tuzla");
			isANumberOfAreaTrue = true;
			break;
		case 19: 
			System.out.println("Zenica");
			isANumberOfAreaTrue = true;
			break;
		
		// Crna Gora
		
		case 21:
			System.out.println("Podgorica");
			isANumberOfAreaTrue = true;
			break;
		case 26:
			System.out.println("Niksic");
			isANumberOfAreaTrue = true;
			break;
		case 29:
			System.out.println("Pljevlja");
			isANumberOfAreaTrue = true;
			break;
		case 20: case 22: case 23: 
		case 24: case 25: case 27: 
		case 28:
			isANumberOfAreaTrue = false;
			break;
			
		// Hrvatska
			
		case 30:
			System.out.println("Osijek, Slavonija regija");
			isANumberOfAreaTrue = true;
			break;
		case 31:
			System.out.println("Bjelovar, Virovitica, Koprivnica, Pakrac, Podravina regija");
			isANumberOfAreaTrue = true;
			break;
		case 32:
			System.out.println("Varaždin, Medjimurje regija");
			isANumberOfAreaTrue = true;
			break;
		case 33:
			System.out.println("Zagreb");
			isANumberOfAreaTrue = true;
			break;
		case 34:
			System.out.println("Karlovac");
			isANumberOfAreaTrue = true;
			break;
		case 35:
			System.out.println("Gospic, Lika regija");
			isANumberOfAreaTrue = true;
			break;
		case 36:
			System.out.println("Rijeka, Pula, Istra i Primorje regija");
			isANumberOfAreaTrue = true;
			break;
		case 37:
			System.out.println("Sisak, Banovina regija");
			isANumberOfAreaTrue = true;
			break;
		case 38:
			System.out.println("Split, Zadar, Dubrovnik, Dalmacija regija");
			isANumberOfAreaTrue = true;
			break;
		case 39:
			System.out.println("ostalo");
			isANumberOfAreaTrue = true;
			break;
			
		//Makedonija
			
		case 40: 
			isANumberOfAreaTrue = false;
			break;
		case 41:
			System.out.println("Bitolj");
			isANumberOfAreaTrue = true;
			break;
		case 42:
			System.out.println("Kumanovo");
			isANumberOfAreaTrue = true;
			break;
		case 43:
			System.out.println("Ohrid");
			isANumberOfAreaTrue = true;
			break;
		case 44:
			System.out.println("Prilep");
			isANumberOfAreaTrue = true;
			break;
		case 45:
			System.out.println("Skoplje");
			isANumberOfAreaTrue = true;
			break;
		case 46:
			System.out.println("Strumica");
			isANumberOfAreaTrue = true;
			break;
		case 47:
			System.out.println("Tetovo");
			isANumberOfAreaTrue = true;
			break;
		case 48:
			System.out.println("Veles");
			isANumberOfAreaTrue = true;
			break;
		case 49:
			System.out.println("Stip");
			isANumberOfAreaTrue = true;
			break;
			
		// Slovenija
			
		case 50:
			System.out.println("Slovenija");
			isANumberOfAreaTrue = true;
			break;
		case 51: case 52: case 53: 
		case 54: case 55: case 56: 
		case 57: case 58: case 59:
		case 60: case 61: case 62:
		case 63: case 64: case 65:
		case 66: case 67: case 68:
		case 69: case 70:
			isANumberOfAreaTrue = false;
			break;

		// Srbija
		
		case 71: 
			System.out.println("Beograd regija");
			isANumberOfAreaTrue = true;
			break;
		case 72:
			System.out.println("Sumadija");
			isANumberOfAreaTrue = true;
			break;
		case 73:
			System.out.println("Nis");
			isANumberOfAreaTrue = true;
			break;
		case 74:
			System.out.println("Juzna Morava");
			isANumberOfAreaTrue = true;
			break;
		case 75:
			System.out.println("Zajecar");
			isANumberOfAreaTrue = true;
			break;
		case 76:
			System.out.println("Podunavlje");
			isANumberOfAreaTrue = true;
			break;
		case 77:
			System.out.println("Podrinje i Kolubara");
			isANumberOfAreaTrue = true;
			break;
		case 78:
			System.out.println("Kraljevo");
			isANumberOfAreaTrue = true;
			break;
		case 79:
			System.out.println("Uzice");
			isANumberOfAreaTrue = true;
			break;

		// Autonomna Pokrajna Vojvodina
		
		case 80:
			System.out.println("Novi Sad");
			isANumberOfAreaTrue = true;
			break;
		case 81:
			System.out.println("Sombor");
			isANumberOfAreaTrue = true;
			break;
		case 82:
			System.out.println("Subotica");
			isANumberOfAreaTrue = true;
			break;
		case 83: case 84:
			isANumberOfAreaTrue = false;
			break;
		case 85:
			System.out.println("Zrenjanin");
			isANumberOfAreaTrue = true;
			break;
		case 86:
			System.out.println("Pancevo");
			isANumberOfAreaTrue = true;
			break;
		case 87:
			System.out.println("Kikinda");
			isANumberOfAreaTrue = true;
			break;
		case 88:
			System.out.println("Ruma");
			isANumberOfAreaTrue = true;
			break;
		case 89:
			System.out.println("Sremska Mitrovica");
			isANumberOfAreaTrue = true;
			break;

		// Autonomna Pokrajina Kosovo i Metohija
			
		case 90: 
			isANumberOfAreaTrue = false;
			break;
		case 91:
			System.out.println("Pristina");
			isANumberOfAreaTrue = true;	
			break;
		case 92:
			System.out.println("Kosovska Mitrovica");
			isANumberOfAreaTrue = true;	
			break;
		case 93:
			System.out.println("Pec");
			isANumberOfAreaTrue = true;	
			break;
		case 94:
			System.out.println("Djakovica");
			isANumberOfAreaTrue = true;	
			break;
		case 95:
			System.out.println("Prizren");
			isANumberOfAreaTrue = true;	
			break;
		case 96:
			System.out.println("Kosovsko Pomoravski okrug");
			isANumberOfAreaTrue = true;	
			break;
		case 97: case 98: case 99:
			isANumberOfAreaTrue = false;
			break;
		}
		
	}
}
