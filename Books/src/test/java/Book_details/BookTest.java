package Book_details;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class BookTest
{
 public String b_name;
    public int b_id;
    public String b_publisher;
    public int b_quantity;
 //   List<Books> book_copy=new ArrayList<Books>();
   // List<Books> book1=new ArrayList<Books>();
   // BookTest b3=new BookTest();
  // Books b1=new Books();
   Book_call bc=new Book_call();
  // int size_test;

     
@Test
public void create()
{
    Books bk1=new Book_builder().book_name("Toy_story").get_book();
    bc.insert(bk1);
    Books bk2=new Book_builder().book_ID(100).book_name("Buzz light_year").get_book();
    bc.insert(bk2);
    int sz1=bc.cr_del();
    System.out.println(sz1);
 //   assertEquals(size_test,sz1);
  //  System.out.println(size_test);

}
   
/*@Test
public void delete()
{
    bc.cr_del(book);
     Books bb=new Book_builder().book_ID(100).get_book();
     book.remove(bb);
    // String 
    // assertTrue();
    
}*/





}