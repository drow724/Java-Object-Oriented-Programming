package prat3.ex6.인터페이스;

public class A {
	private B b;
	
	public A() {
		b= new B();
	}
	
	public void print() {
		int total = b.total();
		
		System.out.printf("total is %d\n", total);
	}
}
