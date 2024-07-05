import java.util.Scanner;

class Helper{
	public static int getI(){
		Scanner sc =new Scanner(System.in);
		int value =sc.nextInt();
		
		return value;
	}

	public static String getS(){
		Scanner sc =new Scanner(System.in);
		String value =sc.nextLine();
		
		return value;
	}
	public static float getF(){
		Scanner sc =new Scanner(System.in);
		float value =sc.nextFloat();

		return value;
	}

}