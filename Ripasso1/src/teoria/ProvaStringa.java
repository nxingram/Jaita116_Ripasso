package teoria;

public class ProvaStringa {
	public static void main(String[] args) {

		String uno = "uno";//immutabile, quasi costante, se aggiungo la ricrea in memoria heap
		uno += " ";
		uno += "topo";
		System.out.println(uno);
		uno.contains("topo");
		
		StringBuilder builder = new StringBuilder();
		builder.append("due");
		builder.append(" ");
		builder.append("gatti");
		builder.length();
		builder.reverse();
//		String risultato = builder.toString();
		
		System.out.println(builder.toString());
//		System.out.println(risultato);
		
		
	}
}
