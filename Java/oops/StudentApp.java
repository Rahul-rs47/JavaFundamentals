class StudentApp{
	public static void main(String args1[]){

		Student student1 = new Student();
		Student student2 = new Student();
		
		System.out.println("Enter the details of the student 1");
		student1.getStudent();

		System.out.println("Enter the details of the student 2");
		student2.getStudent();

		student1.prepareMarkSheet();
		student2.prepareMarkSheet();


		student1.displayStudentData(); 
		// current object
		// the object by in which the method is called
		// student1 --> current object

		student2.displayStudentData();

	}
}