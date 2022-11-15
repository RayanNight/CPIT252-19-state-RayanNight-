package composite;

public class Developer implements Employee{
  private String name;
  private double salary;

  public Developer(String name,double salary){
    this.name = name;
    this.salary = salary; 
  }

  public String getName() {
    return name; 
  }

  public double getSalary() {
    return salary; 
  }

  public void print() {
    System.out.println("Name ="+getName());
    System.out.println("Salary ="+getSalary());}

  public void remove(Employee employee) { 
  }

  public void add(Employee employee) {
  }

  public Employee getChild(int i) { 
    return null; 
  }
}

