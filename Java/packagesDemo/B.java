package pack2;

//import pack1.A;
//import pack1.C;
import pack1.*;
import pack1.sub1.D;

public class B{
	public static void main(String args[]){
		A a1 = new A(100);
		System.out.println("a1.i : " + a1.getI());

		C c1 = new C(200);
		System.out.println("c1.j : " + c1.getJ());

		D d1 = new D(300);
		System.out.println("d1.k : " + d1.getK());
	}
}