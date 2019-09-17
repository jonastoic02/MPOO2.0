package Heranca;

public class App {
	public static void main(String[] args) {
		A objA = new A();
		B objB = new B(1,2);
		C objC = new C(3,4,5);
		D objD = new D(6,7,8);
		
		System.out.println(objB instanceof A);
		System.out.println(objC instanceof A);
		System.out.println(objD instanceof A);
		
		
		System.out.println(objB.getA());
		System.out.println(objC.getA());
		System.out.println(objD.getA());
		
		objB.metodoA();
	}
}
