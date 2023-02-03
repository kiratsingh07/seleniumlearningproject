package weekone;

public class Strings_Practice {
	
	public static void main(String[] args) {
		
		
		String a = "   guru   ";
		
		// Equals, Equals Ignore Case, Contains, 
		// length, replace, 
		
		if(a.equals("Guru")) {
			System.out.println("Matches");
		}
		
		if(a.equalsIgnoreCase("Guru")) {
			System.out.println("Ignore Case Matched");
		}
		
		
		if(a.contains("Guru")) {
			System.out.println("Contains Match");
		}
		
		
		System.out.println(a.length());
		
		System.out.println(a.charAt(5));
		
		String b = a.replace("i", "I");
		System.out.println(b);
		System.out.println(a);
		System.out.println(a.trim());
		
		if(a.trim().startsWith("G")) {
			System.out.println("Starts With G");
		}
		
		if(a.endsWith("t")) {
			System.out.println("Ends With T");
		}
		
		
		
	}

}
