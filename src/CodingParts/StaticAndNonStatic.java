package CodingParts;

public class StaticAndNonStatic {
	
	String name ="Rahul";  //non static global variable
	
	static int age =25;    //static global variable


	public static void main(String[] args) {
		// direct calling
		sum();
		//By class Name
		StaticAndNonStatic.sum();
		
		//variable---
		
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
		
		//we can not call the non static method or variabale directly ....
		
		// Can I access static method with object refrence?Yes
		
		StaticAndNonStatic sa = new StaticAndNonStatic();
		sa.SendMail();
		System.out.println(sa.name);
		sa.sum();
		
		

}
	
	public void SendMail(){
		System.out.println("Send MAil Method");
		
		
		
	}
	
	public static void sum(){
		
		System.out.println("Sum method is solving");
	}
	}
