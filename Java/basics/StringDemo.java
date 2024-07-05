class StringDemo{
	public static void main(String args[]){

			String s3 = new String("welcome");
			String s1= "welcome";
			String s2 = "welcome";
		//	String s3 = new String("welcome");
			if (s1 == s2){// compares the address
				System.out.println("s1 == s2-True");

			}else {
				System.out.println("s1 == s2-false");
			}

			if (s1.equals(s2)){// compares the content 
				System.out.println("s1.equals(s2)-True");

			}else {
				System.out.println("s1.equals(s2)-false");
			}

			if (s1 == s3){// compares the address
				System.out.println("s1 == s3-True");

			}else {
				System.out.println("s1 == s3-false");
			}

			if (s1.equals(s3)){// compares the content 
				System.out.println("s1.equals(s3)-True");

			}else {
				System.out.println("s1.equals(s3)-false");
			}
	}		


}