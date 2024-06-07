package teoria;

public class TipiVariabileProva {

	public static void main(String[] args) {
		//variabili e tipi primitivi
//		https://www.html.it/pag/15102/variabili/
//		https://www.html.it/pag/15101/tipi-primitivi-di-java-e-valori/
		/*
		 1435
		 8bit
		 00000000 = 0x2^0 =
		 00000001 = 1x2^0 =1 
		 00000010 = 0x2^0 + 1x2^1 = 2  
		 00000011 = 1x2^0 + 1x2^1 = 3 
		 00000100 = 0x2^0 + 0x2^1 + 1x2^2  = 4  
		 .....
		 01111111 = 127
		 */
	
		byte ottoBit = 127;
		
//		00000000000000000000000000000000
		int bit32 = 12121212;
		
//		0000000000000000000000000000000000000000000000000000000000000000

		long bit64 = 1545454545;
		
		//0/1
		boolean provaBool = true;
		
		//16bit Unicode
		char carattere = 'C';
		
		String esStringa = "CA"; 
		esStringa.length();
		char[] esStringa2 = {'C','A'}; 
		int lun = esStringa2.length;
		
		//classi-wrapper e boxing-e-unboxing
		//https://www.html.it/pag/49841/classi-wrapper/
		//https://www.html.it/pag/18024/boxing-e-unboxing/
		
		String quarantatre = "43";
		Integer q = new Integer(quarantatre);
		quarantatre = quarantatre + 1; 
		System.out.println(quarantatre);
		q = q +1;
		System.out.println(q.intValue());
		
		
		int x1 = 10; 
		Integer x2 = 10; 
		
		int prima = 1;
		int seconda = 1;
		
		System.out.println(prima == seconda);
		
		Integer x = new Integer (1000);
		Integer y = new Integer (1000);
		
//		perchè sono i riferimenti nella memoria Heap
		System.out.println(x == y); // false! 
		
		System.out.println(x.intValue() == y.intValue()); // true!

		
		
		double v1 = 1.9121243435445; //64bit con virgola
		float v2; //32bit con virgola - Null
		int v3 = 5; //32bit senza virgola
		
//		v2 = v1; // non si può assegnare un double a un float
//		v1 = v3; // non si può assegnare un intero a un double
//		System.out.println("v1: " +v1);
		
		//CASTING: https://www.html.it/pag/15103/operatori/
		v2 = (float) v1; //ATTENZIONE! taglio 32bit, li butto, perdita di informazioni
//		v1 = (double) v3;

		v3 = (int) v1;
		System.out.println(v1);
		System.out.println(v3);
		
		int v5 = 1/3; //perdita di informazioni
		double v6 = (double)1/3; //cast esplicito
		double v7 = 1.0/3.0;
		System.out.println(v5);
		System.out.println(v6);
		System.out.println(v7);
	}

}
