package worker;
class Employee
{
    int id;
    String name;
    String designation;

public Employee(int id, String name,String designation)
{
   this.id=id;
   this.name=name;
   this.designation=designation;
}

public String toString()
{

return id+" "+name+"  "+designation;

}

}