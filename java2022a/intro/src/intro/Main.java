package intro;

public class Main {

	// Main javada başlangıç noktasıdır.
	public static void main(String[] args) {
		System.out.println("Hello world!");
		// değişken isimlendirmeleri java'da camelCase yazılır
		String ortaMetin="ilginizi çekebilir";
		String altMetin="Vade süresi";
		
		System.out.println(ortaMetin);
		// değişkeni "" ile yazmamalıyız.Yani yukarıdaki gibi yazmalıyız.
		//Int, integer (yanı tam sayı)dan geliyor
		int vade = 12 ;
		
		double dolarDun=18.14;
		
		double dolarBugun=18.10;
		
		boolean dolarDüştüMü=false;
		
		String okYonu="";
		
		if (dolarDüştüMü) {//true
			okYonu ="down.svg";
		
			System.out.println(okYonu);
		} else {
		    okYonu="up.svg";
				System.out.println(okYonu);
		}
		
	}

}
