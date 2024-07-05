
class Student{
	int studentId;
	String studentName;
	int mark1;
	int mark2;
	int mark3;
	int total;
	char grade;
	String result;


	

	public void prepareMarkSheet(){
		total = mark1 + mark2 + mark3;
		//System.out.println("The Toatl mark is: " + total);
		if(mark1 > 50 && mark2 > 50 && mark3 > 50){
			result = "passed";
				
		}else{
			result ="failed";
		}
		

		int percentage =(int)(((float)total / 300)*100);

		//System.out.println(percentage);
		if(percentage >= 90){
			grade ='A';
		}else if(percentage >= 80 && percentage <=89){
			grade = 'B';
			}else if(percentage >= 70 && percentage <= 79){
				grade ='C';
				}else if(percentage >= 60 && percentage <= 79){
				grade ='D';
					}else if(percentage >= 50 && percentage <= 59){
					grade ='E';
						}else {
						grade ='F';
						}
		
	}

	public void displayStudentData(){
		// this refers the current object
		// this optional and default
		System.out.println("Student name: " + this.studentName);
		System.out.println("Student Id : " + this.studentId);
		System.out.println("Mark 1 : " + mark1);
		System.out.println("Mark 2 : " + mark2);
		System.out.println("Mark 3 : " + mark3);
		System.out.println("Grade : " + grade);
		System.out.println("Result : " + result);
	}

	public void getStudent(){
		System.out.println("Enter the Student name:");
		studentName = Helper.getS();
		System.out.println("Enter the Student id:");
		studentId = Helper.getI();
		System.out.println("Enter the Student mark1:");
		mark1 = Helper.getI();
		System.out.println("Enter the Student mark2:");
		mark2 = Helper.getI();
		System.out.println("Enter the Student mark3:");
		mark3 = Helper.getI();

	}

	

/*
	public static void main(String args[]){
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

	*/





}	