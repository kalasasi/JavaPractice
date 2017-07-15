package programs;

public class Deer {
public Deer() { 
	System.out.print("Deer");
}
public Deer(int age) { 
	System.out.print("DeerAge"); 
}
private boolean hasHorns() {
	return false; 
	}

public static void main(String[] args) {
 Deer deer = new Reindeer(5);
 new Deer(12);
 System.out.println(","+deer.hasHorns());
 
 }
}
 class Reindeer extends Deer {
 public Reindeer(int age) {
	 System.out.print("Reindeer"); 
	 }
public boolean hasHorns(int a) {
	return true;
}
}
