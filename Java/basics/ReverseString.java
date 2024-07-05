import java.util.Scanner;
	class ReverseString{
		public static void main (String args[]){

			//String s1 ="Welcome";
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String");

			String s1 = sc.nextLine();
			int length = s1.length() - 1;
			//System.out.println(length);
			String s2 = "";
			char c;
			while(length>=0){
				 c = s1.charAt(length);
				 //System.out.println(c);
				 s2 = s2.concat(String.valueOf(c));
				// System.out.println(s2);
				 length --;

			}
			System.out.println(s2);


		}
	}