package _FinalKeyword_Concept;

class parent {
	
	
	public void test()   {
		
		System.out.println("Hi this is test method in parent class");
	}
	
	
//	final public void test()   {
		
	//	System.out.println("Hi this is test method in parent class");
//	}
}


public class _1_FinalKeyword_2 extends parent  {

	//@Override
	public void test() {
		
		System.out.println("Hi this is test method in child class");
		
	}
	
	
	public static void main(String args[])   {
		
		
		_1_FinalKeyword_2 ch = new _1_FinalKeyword_2();
		
		ch.test();
		
	}
 	  
	
}
