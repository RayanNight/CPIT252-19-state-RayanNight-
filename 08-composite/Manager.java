package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee{

  private String name;
  private double salary;
  List<Employee> employees = new ArrayList<Employee>();

  public Manager(String name,double salary){
    this.name = name;
    this.salary = salary; 
  }

  public String getName() {
    return name; 
  }

  public double getSalary() {
    return salary;
  }


  public void add(Employee employee) {
    employees.add(employee); 
  }

  public void remove(Employee employee) {
    employees.remove(employee);
  }

  public Employee getChild(int i) {
    return employees.get(i); 
  }

  public void print() {

    System.out.println("Name ="+getName());
    System.out.println("Salary ="+getSalary());

    Iterator<Employee> employeeIterator = employees.iterator();
    while(employeeIterator.hasNext()){
      Employee employee = employeeIterator.next();
      employee.print();
    }
  }
}

