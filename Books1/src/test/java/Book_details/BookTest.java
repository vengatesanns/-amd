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
   Book_call bc=new Book_call();
   int sz1;
  
   
@Test
public void create()
{
    Books bk1=new Book_builder().book_name("Toy_story").get_book();
    bc.insert(bk1);
    Books bk2=new Book_builder().book_ID(100).book_name("Buzz light_year").get_book();
    bc.insert(bk2);
     sz1=bc.cr_del();
    System.out.println(sz1);
  assertEquals(2,sz1);
}
   
@Test
public void delete()
{
  Books bd=new Book_builder().book_name("Toy_story").get_book();
  bc.delete(bd);
 //Books bk2=new Book_builder().book_name("Buzz light_year").get_book();
   // bc.delete(bk2);
   int x=bc.cr_del();
   System.out.println(bc.del());
 assertEquals(bc.del(),x);

    
}





}