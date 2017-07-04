//package Book_details;
import java.util.*;
public class Books
{
  static List<Books> book1=new ArrayList<Books>();
    public String b_name;
    public int b_id;
    public String b_publisher;
    public int b_quantity;
    public Books()
    {

    }
  public Books(int b_id,String b_name,String b_publisher,int b_quantity)
  {
    this.b_id=b_id;
    this.b_name=b_name;
    this.b_publisher=b_publisher;
    this.b_quantity=b_quantity;
  }
 public String toString()
 {
   return b_id+" "+b_name+" "+b_publisher+" "+b_quantity+" ";
 }
   


}