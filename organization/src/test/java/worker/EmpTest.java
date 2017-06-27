package worker;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class EmpTest
{
    
     @Test
     public void test1()
     {
    Employee emp1=new Emp_builder().set_name("vengat").get_data();
    System.out.println(emp1);
}
}