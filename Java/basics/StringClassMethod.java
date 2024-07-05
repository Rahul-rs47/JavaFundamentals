class StringClassMethod{
	public static void main(String args[]){

		String s1 = "welcome to java programming";
		String s2 = "welcome to java programming";
		String s3 = "Welcome to java programming";
		String s4 = "  Welcome to java programming ";
		String s5 = "a";
		String s6 = "A";
		String s7 = "b";

		char c = s1.charAt(3);
		System.out.println("s1 " + s1);
		System.out.println("s1.charAt(3) : " + c );
		System.out.println("s1.length() : " + s1.length() );//gives number of chareacters
		System.out.println("s1.substring(2) : " + s1.substring(2) );//for operations in s1 after 2nd character
		System.out.println("s1.isEmpty() : " + s1.isEmpty() );//
		System.out.println("s1.replace('a','@') : " + s1.replace('a','@') );
		System.out.println("s1.equals(s2) : " + s1.equals(s2) );
		System.out.println("s1.equals(s3) : " + s1.equals(s3) );
		System.out.println("s1.equalsIgnoreCase(s3) : " + s1.equalsIgnoreCase(s3) );
		System.out.println("s1.indexOf('e') : " + s1.indexOf('e') );// produces the character number
		System.out.println("s1.indexOf('e',7) : " + s1.indexOf('e',7) );
		System.out.println("s1.indexOf('e',3) : " + s1.indexOf('e',3) );
		System.out.println("s1.indexOf(\"to\") : " + s1.indexOf("to") );
		System.out.println("s3.toLowerCase : " + s3.toLowerCase() );
		System.out.println("s1.toUpperCase : " + s1.toUpperCase() );

		System.out.println("s4:" + s4);
		System.out.println("s4.trim():" + s4.trim());

		System.out.println("s1.substring(2,5) : " + s1.substring(2,5) );
		System.out.println("s1.substring(2,3) : " + s1.substring(2,3) );

		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
		System.out.println("s4: " + s4);
		System.out.println("s1.concat(s2) : " + s1.concat(s2) );//combine
		System.out.println("s1.lastIndexOf('e') : " + s1.lastIndexOf('e') );

		System.out.println("s5.compareTo(s6) : " + s5.compareTo(s6) );
		System.out.println("s6.compareTo(s5) : " + s6.compareTo(s5) );
		System.out.println("s5.compareTo(s7) : " + s5.compareTo(s7) );
		System.out.println("s5.compareToIgnoreCase(s6) : " + s5.compareToIgnoreCase(s6) );
		System.out.println("s1.startsWith  wel : " + s1.startsWith("wel") );
		System.out.println("s1.startsWith \"abc\": " + s1.startsWith("abc") );
		System.out.println("s1.endsWith (\"ing\") : " + s1.endsWith("ing") );

		

	}
}
