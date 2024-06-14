package prova;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProvaThreads {

	public static void main(String[] args) {

		// 1
		MioThread mioThread = new MioThread();
		Thread thread = new Thread(mioThread);
		// da nessuna parte io ho chiamato il metodo run() del Mio thread
//		mioThread.run();

		// Schedulatore dei thread chiama run() quando il thread è pronto (stato Ready)
		thread.start();

		// 2
		// scrittura alternativa con classe anonima che implementa l'interfaccia
		// Runnable,
		// quindi scrivo l'implementazione del metodo run
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Codice del Mio Thread");
			}
		});

		// 3
		// lambda function, scrivo solo il metodo
		// Runnable varTh = () -> System.out.println("Codice del Mio Thread");
		// passo il metodo run direttamente al costruttore del tread
		Thread thread3 = new Thread(() -> System.out.println("Codice del Mio Thread"));

		try {
			// Thread Safe
			List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<Integer>());

			// operazione da eseguire nel thread (nel metodo run)
			Runnable funzionaDaEseguire = () -> synchronizedList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

			Thread thread4 = new Thread(funzionaDaEseguire);
			Thread thread5 = new Thread(funzionaDaEseguire);

			// contenitore
			// [][][][][][][][][][][][][][][][][][][][][][][][][][][][][] dimensione
			// dinamica

			thread4.start();
			thread5.start();
			thread4.join();
			thread5.join();
			
			
			for (Integer integer : synchronizedList) {			
				System.out.println(integer);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
