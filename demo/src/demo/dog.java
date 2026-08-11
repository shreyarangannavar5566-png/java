package demo;

public class dog extends animal {
	public void sound() {
		System.out.println("boww boww");
	}

	public static void main(String[] args) {
		animal a=new animal();
		a.sound();
		
		dog d=new dog();
		d.sound();
		// TODO Auto-generated method stub

	}

}
