package Heranca;

public abstract class A {//superClasse
	private int a;
	private int b;
	
	//Se ouver a necessidade da exist�ncia de um construtor default, devesse declar�-lo,
	//Isso para quando ouver pelo menos 1 n�o-default definido
	public A(){}
	
	public A(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public A(int a) {
		this.a = a;
	}
	
	public abstract void metodoA();
	
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}
