package worker;
class Emp_builder
{
     int id;
    String name;
    String designation;
    public Emp_builder set_ID(int id)
    {
        this.id=id;
        return this;  
  }
  public Emp_builder set_name(String name)
  {
     this.name=name;
     return this;
  }
public Emp_builder set_desig(String designation)
{
    this.designation=designation;
return this;
}
   public Employee get_data()
{
    return new Employee(id,name,designation);

}


}