package weekone;

public class Homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Im in hyderabad" ;
		int len = a.length();
		int voiwel = 0;
		for(int i=0; i<a.length();i++) {
			String b = ""+a.charAt(i);
			if(b.equalsIgnoreCase("A") ||
					b.equalsIgnoreCase("E") ||
					b.equalsIgnoreCase("I") ||
					b.equalsIgnoreCase("O") ||
					b.equalsIgnoreCase("U")) {
				voiwel = voiwel+1;
			}
			
		}
		
		System.out.println(voiwel);
		
			
		String[] x = a.split(" ");
		String rtext = "";
			
		for(int y = 0; y<x.length; y++) {
			String text = x[y];
		String rw = "";
		for(int i=text.length()-1;i>=0;i--) {
			rw=rw + text.charAt(i);
			
		}
		rtext = rtext+" "+rw;
		}
		
		System.out.println(rtext);
		

	}

}
