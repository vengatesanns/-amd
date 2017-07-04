//package Book_details;
import java.util.*;
public class Book_call extends Books
{
static int sz;
static public int cr_del()
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

public void del()
{
   

}
public List<Books> insert(Books bl)
{
book1.add(bl);
return book1;
}
public static void main(String args[])
{
   // Books b=new Book_builder().book_name("Nemo").get_book();
   // System.out.println(b);
  //  book1.add(b);
 System.out.println(sz);
    
}

}