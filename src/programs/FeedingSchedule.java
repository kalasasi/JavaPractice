package programs;

import org.omg.Messaging.SyncScopeHelper;

public class FeedingSchedule {
	public static void main(String[] args) {
 boolean keepGoing = true;
 int count = 0;
 int x = 3;
 while(count++ < 3) {
 int y = (1 + 2 * count) % 3;
 switch(y) {
 default:
 case 0: x -= 1; break;
 case 1: x += 5;
 }
  System.out.println(x);
 while(count++ < 3) {
	
	 switch(x) {
	 default:
	 case 0: x -= 1; break;
	 case 1: x += 5;
 System.out.println("value= " +x);
 } 
 }
 }
	}
}
 
