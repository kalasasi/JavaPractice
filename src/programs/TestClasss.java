package programs;

public class TestClasss{
public static void sayHello(){ System.out.println("Static Hello World"); }  //2
   public void sayHello1() { System.out.println("Hello World "); }  //3
public static void main(String[] args) {
   Float f = null; 
try{    
f = Float.valueOf("12.3"); 
   String s = f.toString();  
  int i = Integer.parseInt(s);
    System.out.println("i = "+i); 
} catch(Exception e){ 
   System.out.println("trouble : "+f);

 }
  //new TestClass().sayHello();    //1
   
}
}