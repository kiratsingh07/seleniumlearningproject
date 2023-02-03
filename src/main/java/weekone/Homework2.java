package weekone;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a= "gurkirat is in hyderabad";
System.out.println(a.trim());
System.out.println(a.length());
String b ="hyderabad";
System.out.println(b.toUpperCase());
String c= "selenium";


		int len = c.length();
		String rw = "";
		for(int i = len-1; i>=0; i--) {
			rw = rw+c.charAt(i);
			System.out.println(rw);
		}
		
		if(c.equals(rw)) {
			System.out.println("Its Palindrome");
		}else {
			System.out.println("Its Not Palindrome");
		}


	}

}
