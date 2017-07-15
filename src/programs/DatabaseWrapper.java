package programs;

public class DatabaseWrapper { 
	  static String url = "jdbc://bookSb://localhost:3306//mydb";   
	static DatabaseWrapper getDatabase()   {    
	  System.out.println("Getting DB");     
	 return null;   
	} 
	  public static void main(String[ ] args)   {  
	   System.out.println( getDatabase().url );
	   } 
	}