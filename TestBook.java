package programs.java8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static programs.java8.BookPredicate.*;
public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book =new Book("Wings of fire","Arun tiwar",170.90);
		Book book1 =new Book("Sathya sothanai","Gandhiji",234.00);
		Book book2 =new Book("Monk in yog","Rabin sharma",300.43);
		List<Book> booklist =new ArrayList<Book>();
        booklist.addAll(Arrays.asList(new Book[]{book,book1,book2}));
        System.out.println(booklist);
        System.out.println(Books(booklist,isPrice()));
	}

}
