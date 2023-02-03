package weekone;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 5;
		
		if(a>5) {
			System.out.println("A is Greater Than 5");
		}else if(a<5){
			System.out.println("A is Less Than 5");
		}else {
			System.out.println("A is equal to 5");
		}
		
		
		if(a>5) {
			if(a<15) {
				System.out.println();
			}
		}
		
		
		
		if(a>5 && a<15) {
			System.out.println("A is between 5 and 15");}	
		
		
		// for. while and do while
		
		for(int i=10; i>0; i=i-3) {
			System.out.println(i);
		}
		
		
		

	}

}
