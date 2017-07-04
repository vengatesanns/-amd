//package Book_details;
public class Book_builder extends Books
{
   
    public Book_builder book_name(String b_name)
    {
        this.b_name=b_name;
        return this;
    }
  public Book_builder book_ID(int b_id)
    {
        this.b_id=b_id;
        return this;
    }
      public Book_builder book_publisher(String b_publisher)
    {
        this.b_publisher=b_publisher;
        return this;
    }
  public Book_builder book_quantity(int b_quantity)
    {
        this.b_quantity=b_quantity;
        return this;
    }

public Books get_book()
{
    return new Books(b_id,b_name,b_publisher,b_quantity);
}




}