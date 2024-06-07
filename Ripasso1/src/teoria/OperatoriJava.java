package teoria;

public class OperatoriJava {

	public static void main(String[] args) {

		int x = 0;
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
		
		
		boolean risultato = X>W && x==10;
		System.out.println(risultato);

		
	}

}
