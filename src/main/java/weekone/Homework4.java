package weekone;

public class Homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="im in hyderabad";
				int len=a.length();
				int vowel=0;
				for(int i=0;i<a.length();i++)
				{String b= ""+a.charAt(i);
				if (b.equalsIgnoreCase("A") ||
				b.equalsIgnoreCase("E")||
				b.equalsIgnoreCase("I")||
				b.equalsIgnoreCase("O")||
				b.equalsIgnoreCase("U")) {
					vowel=vowel+1;
				}
				
				
			
				}System.out.println(vowel);
				
				
				

	}

}
