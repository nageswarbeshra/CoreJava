package Inheritance;

public class ParentClass extends ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassB pa = new ClassB();

		System.out.println(pa.a);
		pa.mathodsB();
		

	}
	
	public void parentMethodA() {
		System.out.println("This is Parent Class method");
	}

}
