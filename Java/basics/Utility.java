import java.util.Scanner;
class Utility {
	public static void main (String args []){
		System.out.println("Enter the tmeperature value in degree celsius");
		double num1 ;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextDouble();
		double output = centigradeToFahrenheit(num1);
		System.out.println(num1 + " in fahrenheit is " + output);

		System.out.println("Enter the tmeperature value in dgree fahrenheit");
		double num2 ;
				num2 = sc.nextDouble();
		double output1 = fahrenheitToCentigrade(num2);
		System.out.println(num1 + "in celsius is " + output1);

	}
	public static double centigradeToFahrenheit(double value){
		double out;
    	out = (  value *  9 / 5  ) + 32;
    	return out;
    }

    public static double fahrenheitToCentigrade(double value){
		double out;
    	out =  (value - 32) * 5 / 9  ;
    	return out;
    }

    public static int getI(){
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
    }
}