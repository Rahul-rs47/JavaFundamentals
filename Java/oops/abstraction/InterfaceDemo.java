class InterfaceDemo{

	public static void main(String args[]){

		/*FileReader fileReader = new FileReader();

		fileReader.greet();
		fileReader.display();
		fileReader.write();
		fileReader.sop("Saravanan Welcomes you all");

		System.out.println(FileReader.msg);*/

		InterfaceSample interfaceSample = new InterfaceSample();
		interfaceSample.method1();
		interfaceSample.method2();
		interfaceSample.method3();

		IReader fileReader = new FileReader();

		fileReader.greet();
		fileReader.display();
		//fileReader.write();
	

	}
	
}


class Helper{
	public  void sop(String message){
		System.out.println(message);
	}
}


interface IReader{

	String msg  = "Welcome to Java Interface";

	public abstract void display();
	public  void greet();

}

interface IWriter{
	public void write();
	public void display();
}

class FileReader extends Helper implements IReader, IWriter {

	public  void greet(){
		// msg = "GM from greet";
		System.out.println(msg);
	}

	public  void display(){
		System.out.println("From display function : " + msg);
	}

	public void write(){
		System.out.println("From write function : " + msg);
	}

}


interface I1{

	public void method1();

}

interface I2{

	public void method2();

}

interface I3 extends I1, I2{

	public void method3();

}


class InterfaceSample implements I3{
			public void method1(){
					System.out.println("I am from Method 1");
			}

			public void method2(){
					System.out.println("I am from Method 2");
			}

			public void method3(){
					System.out.println("I am from Method 3");
			}
}