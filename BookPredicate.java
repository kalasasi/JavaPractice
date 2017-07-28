package programs.java8;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookPredicate {
 public static Predicate<Book> isPrice(){
	 return s->s.getPrice()>=200;
 }
 public static List<Book>Books(List<Book> book,Predicate<Book>predicate){
	 return book.stream().filter(predicate).collect(Collectors.<Book>toList());
 }
 
}
