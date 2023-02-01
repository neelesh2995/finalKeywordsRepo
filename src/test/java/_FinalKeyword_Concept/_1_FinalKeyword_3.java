package _FinalKeyword_Concept;

class Parent_1    {
	
	
	public void test()  {
		
		System.out.println("Hi this is test method in parent class");

	}
}


//final class Parent_1    {
	
	
//	public void test()  {
		
	//	System.out.println("Hi this is test method in parent class");

	//}
//}




public class _1_FinalKeyword_3 extends Parent_1 {
	
	
	
	//@Override
		public void test() {
			
			System.out.println("Hi this is test method in child class");
			
		}
		
		
		public static void main(String args[])   {
			
			
		//	_1_FinalKeyword_2 ch = new _1_FinalKeyword_2();
			
			Parent_1 m = new Parent_1();
		//	ch.test();
			m.test();
		}
	
	

}
