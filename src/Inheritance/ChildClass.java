package Inheritance;

public class ChildClass extends ParentClass  {
     
  public void car() {
	  System.out.println("Car method from ChildClass");
  }
  
  
 @Override
  public void trucks(int salary) {	  
	  int x =10;
	  int y=20;
	  System.out.println("Trucks method from childclass");
  }
 
 public void shops() {
	 System.out.println("shops method from childClass");
 }
 
 @Override
 public void hill(int salary) {
	 System.out.println("hill method from child class");
 }

}
