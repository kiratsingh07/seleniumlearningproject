package weekone;

public class Switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;
String c = "Add";
switch(c) {


case "Add":{
	System.out.println(a+b);
	break;
}

case "Mul":{
	System.out.println(a*b);
	break;
}

case "Sub":{
	System.out.println(a-b);
	break;
}

default:{
	System.out.println("Please Enter valid Input");
	break;
}


}
	
	}

}
