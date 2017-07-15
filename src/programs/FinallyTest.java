package programs;

public class FinallyTest{ 
	   public static void main(String args[]){ 
	      try{         
	  if (args.length == 0) 
	   return;    
	       else throw new Exception("Some Exception");    
	   }      
	 catch(Exception e){   
	        System.out.println("Exception in Main");    
	   }  
	    
	     finally{     
	      System.out.println("The end"); 
	      }   
	     System.out.println(args[1]="Pop");
	 System.out.println(sum(1,4));
	 } 
	public static int sum(int i1, long i2) {
	 return (int) i2;
	 }
	}