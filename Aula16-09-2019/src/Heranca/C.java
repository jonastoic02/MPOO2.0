package Heranca;

public class C extends A {//subClasse
	private int d;

	public C(int d) {
		super();
		this.d = d;
	}

	public C(int a, int b,int d) {
		super(a, b);
		this.d = d;
	}

	public C(int a,int d) {
		super(a);
		this.d = d;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}
	
	

}
