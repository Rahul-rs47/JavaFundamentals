class StudentMarkApp{
	
	public static void main(String args[])	{
		
		
		System.out.println("Enter the Student Name");
		String studentName = Helper.getS();
		System.out.println("Enter the Student Id");
		int studentId = Helper.getI();
		System.out.println("Enter the Student Mark 1");
		int mark1 = Helper.getI();
		System.out.println("Enter the Student Mark 2");
		int mark2 = Helper.getI();
		System.out.println("Enter the Student Mark 3");
		int mark3 = Helper.getI();

		StudentMark s1 = new StudentMark(studentName,studentId,mark1,mark2,mark3);
		
		s1.prepareMarkSheet();

		System.out.println("Student Name: " + s1.getStudentName());
		System.out.println("Student Id: " + s1.getStudentId());
		System.out.println("Mark 1: " + s1.getMark1());
		System.out.println("Mark 2: " + s1.getMark2());
		System.out.println("Mark 3: " + s1.getMark3());
		System.out.println("Result: " + s1.getResult());
		System.out.println("Student Grade: " + s1.getGrade());
		System.out.println("Student Total: " + s1.getTotal() +" out of 300 ");




	}

}