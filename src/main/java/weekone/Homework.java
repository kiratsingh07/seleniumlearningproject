package weekone;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
int x=sc.nextInt();
if(x<=100 && x>90){
	System.out.println ("A++");
	}else if (x<=90 && x>80) {
		System.out.println("A");
	}else if (x<=80 && x>70) {
		System.out.println("B");
	}else if (x<=70 && x>60){
		System.out.println("C");
	}else if (x<=60 && x>50) {
		System.out.println("D");
	}else if (x<=50 && x>35) {
		System.out.println("E");
	}else if (x<=35) {
		System.out.println("f");
	}

}
	}

