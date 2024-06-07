package teoria;

public class CostruttiCondizionaliProva {

	public static void main(String[] args) {
		//https://www.html.it/pag/15104/istruzioni-e-costrutti-fondamentali/
		boolean c1 = true;
		boolean c2 = true;
		boolean c3 = false;
		
		if(c1) {
		// il blocco viene eseguito
			System.out.println(c1);
		} else if(c2) {
			System.out.println(c2);
		// il blocco non viene eseguito anche se 'c2' è 'true'
		}
		
		if(c1) {
		// il blocco viene eseguito
			System.out.println(c1);
		} 
		
		if(c2) {
			System.out.println(c2);
		// il blocco viene eseguito
		}
		
		
		if(c3) {
		// il blocco non viene eseguito perché 'c3' è 'false'
			System.out.println(c3);
		} else if(c2) {
		// il blocco viene eseguito, poiché 'c2' è 'true' mentre 'c3' è 'false'
			System.out.println(c2);
		}
		
		
		
		int c = 1;
		switch (c) {
		case 1: //if(c==1)
		case 2:
		System.out.print(c);
		break;
		case 3:
		System.out.println("3 ");
		case 4:
		System.out.println("4 ");
		default:
		System.out.println("4+");
		}
		
		
		//i++
		//i += 1;
		//i = i + 1;
		
		for(int i=0; i<10; i+=1) {
			// ...
		}
		
		int[] numeri = {1,2,3,4};
		
		for(int i=0; i<numeri.length; i++) {
			// ...
			if(i==3) {
				i++;
			}else{
				
			}
			//i++ - viene fatto qui senza sciverlo
		}
		
		//foreach : inizializzazione e incremento sono fatti 
		//in modo implicito (nascosto, lo fa il costrutto foreach)
		for( int item : numeri ) {
			// ...
			if(item == 4)
			{
				
			}
			
		}
		
		
		int sum = 0;
		for(int i = 1; i < 10; i++) {
			if(i%2 == 0) {
				break; // il blocco che viene interrotto con break
		               // è quello "corrente" nel senso
					   // "del ciclo corrente" (il for)
			}
			sum++;
		}
		System.err.println(sum);
	}
}
