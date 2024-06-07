package teoria;

public class OperatoriJava {

	public static void main(String[] args) {

//		int x = 0;
//		System.out.println(x); //0
//		System.out.println(++x);//1
//		System.out.println(x++);//1
//		System.out.println(x);//2
		
//		int y = ++x;
//		System.out.println("y:"+y + ", x: " +x);
//		y = x++;
//		System.out.println("y:"+y + ", x: " +x);
//		y = --x;
//		System.out.println("y:"+y + ", x: " +x);
//		y = x--;
//		System.out.println("y:"+y + ", x: " +x);
		
		int X,Y,Z,W,V; //dichiarato 5 varibili di tipo int senza inizializzarle
		
		X=10;
		System.out.println("X="+X);
		Y=X++;
		System.out.println("Y=X++: ho X="+X+",Y="+Y);
		Z=++Y;
		System.out.println("Z=++Y: ho Z="+Z+",Y="+Y);
		W=Z--;
		System.out.println("W=Z--: ho W="+W+",Z="+Z);
		V=--W;
		System.out.println("V=--W: ho V="+V+",W="+W);
		
		
		boolean risultato = X>W && X==11;
		boolean risultato2 = V<Z && Y>=10;
		System.out.println(risultato);
		System.out.println(risultato2);
		System.out.println(risultato || risultato2);
		System.out.println( (X>W && X==11) || (V<Z && Y>=10)  );

		int eta = 35;
		String aumento = (eta>=50) ? "Aumento" : "Deve ancora faticare!";//: è else
//		System.out.println(aumento);
		
		//stessa cosa
		if(eta>=50)
		{
			aumento =  "Aumento";
		}else {
			
			aumento =  "Deve ancora faticare!";
		}
		
		//poco leggibile
		aumento = (eta>=50) ? "Aumento" : (eta>30) ? "Piccolo aumento" : "Deve ancora faticare!";
		
		if(eta>=50)
		{
			aumento =  "Aumento";
		}else {
			if(eta>=30) {
				aumento = "Piccolo aumento" ;
			}else {
				
				aumento =  "Deve ancora faticare!";
			}
		}
		
		if(eta>=50)
		{
			aumento =  "Aumento";
		}else if(eta>=30){
			aumento = "Piccolo aumento" ;
		}else {//eta <30
			
			aumento =  "Deve ancora faticare!";
		}
		System.out.println(aumento);
		
		
		
		
	}

}
