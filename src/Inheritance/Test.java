package Inheritance;

public class Test {

	public static void main(String[] args) {
	
	//Childclass_reference_Datatype     variable = new   called_ChildClass_Constructor;
		
	ChildClass ob = new ChildClass();
	ob.trucks(0);       //Static polymorphism or Compile time Polymorphism.
	
	
    //Parentclass_Reference_Datatype   Variable_Name= new  Calling_ ChildclassConstructor();
	ParentClass ob1 = new ChildClass();   // Top Casting 
	
	ob1.House();
	ob1.property();
	ob1.trucks(0);

	
	GrandFather ob3 = new ChildClass();
	ob3.hill();

	}

}
