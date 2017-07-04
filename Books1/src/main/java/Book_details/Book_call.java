//package Book_details;
import java.util.*;
public class Book_call extends Books
{
static int sz;
 public int cr_del()
{
   sz=book1.size();
    if(sz==0)
    {
        System.out.println("LIST is Empty!!!!!");
    }
    else
       { 
          System.out.println("List is already Engaged!!!");
    }
    
return sz;
}

public int del()
{
   int sz2=book1.size();
return sz2;
}
public List<Books> insert(Books bl)
{
book1.add(bl);
return book1;
}
static public List<Books> delete(Books bd)
{
  book1.remove(bd);
  return book1;
}
public static void main(String args[])
{
    Books b=new Book_builder().book_name("Toy_story").get_book();
     System.out.println(b);
     book1.add(b);
 System.out.println(book1);
 Books bd=new Book_builder().book_name("Toy_story1").get_book();
// System.out.println("ccc"+bd);
 book1.add(bd);
 book1.remove(bd);
System.out.println(book1);
    
}

}