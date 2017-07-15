package programs;

class TestClass {
 public  static int number1;
 public  static int number2;
 public static void cal(int n1,int n2){
	 
	 number1=n1;
	 number2=n2;
	 System.out.println(n1+n2); }
 TestClass(){
	 System.out.println("Constructor");
 }
 TestClass(int n){
	 
	 n=n+10;
	 System.out.println(n);
 }
}
 class Test extends TestClass{
	 Test(){
		 super();
		 System.out.println("ClassTest");
	 }
	 public static void main(String [] args){
	
	 new Test();
	  new TestClass(12);
	  TestClass.cal(1, 23);
	 }
}
