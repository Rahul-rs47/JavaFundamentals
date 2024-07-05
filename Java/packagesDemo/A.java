package pack1;

public class A{

	private int i;

	public A(){

	}
	public A(int i){
		this.i = i;
	}

	public int getI(){
		return this.i;
	}
	
	public static void main(String args[]){
		A a1 = new A(100);
		System.out.println("a1.i : " + a1.getI());
	}
}
