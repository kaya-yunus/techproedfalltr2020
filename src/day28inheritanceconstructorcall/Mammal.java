package day28inheritanceconstructorcall;

public class Mammal extends Animal {
	
	public int m=1;
	public int c=4;
	
	public Mammal() {
		this('y'); //super icine parametre koyarsak java parametreli const'a gider parantez icine herhangi bir int konur
		System.out.println("Parametresiz Mammal");
	}
	
	public Mammal(char c) {
		super(17);
		System.out.println("Parametreli Mammal");
	}
	
	public void mM() {
		System.out.println("Mammal");
	}public void mC() {
		System.out.println("Mammal+Cat");
	}
	
	
}
