package Heranca;

public class B extends A {
	private int c;
	
	
	//Se ouver um defaul, não há obrigatoriedade do super, se não ouver default e existir um não default, deve-se haver o uso do super
	//Erro de semânica: Havendo construtores na superclasse, a subclasse deve prever todos os construtores definidos da superClasse
	//Sintaxe: apesar de existir vários não defaul se precisar definir pelo menos 1;
	public B(int a, int b, int c) {
		super(a,b);
		this.c = c;
	}

	public B(int a,int c) {
		super(a);
		this.c = c;
	}

	public int getC() {
		return c;
	}
	
	//Uso de sobrescrita, não permite diminuir a visibilidade - private
	//Quem sobrescreve metodos abstratos é classe concreta
	//		Se deixar - B não é obrigado a implementar
	//		Se não deixar, B é obrigado a implementar
	public void metodoA(){
		System.out.println("Metódo B");
	}
	
	public void setC(int c) {
		this.c = c;
	}
	
	
	
}