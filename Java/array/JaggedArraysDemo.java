class JaggedArraysDemo{
	public static void main (String args[]){
		int jagged[][] = new int [3][];
		jagged[0] =new int [2];
		jagged[1] =new int [3];
		jagged[2] =new int [1];
		jagged[0][0] = 10;
		jagged[0][1] = 20;

		jagged[1][0] = 30;
		jagged[1][1] = 40;
		jagged[1][2] = 50;

		jagged[2][0] = 60;

		System.out.println("length of row 0 " +jagged[0].length );
		System.out.println("length of row 1 " +jagged[1].length );
		System.out.println("length of row 2 " +jagged[2].length );
		System.out.println("length of array " +jagged.length );


	}
}